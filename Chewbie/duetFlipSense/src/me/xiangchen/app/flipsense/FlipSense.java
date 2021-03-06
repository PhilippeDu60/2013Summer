package me.xiangchen.app.flipsense;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.ml.FlipSenseClassifier;
import me.xiangchen.ml.xacFeatureMaker;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FlipSense extends Activity implements SensorEventListener {
	
	final public static String LOGTAG = "FlipSense";
	final public static int PHONEACCELFPS = 50; // Hz
	final public static int FLIP = 0;
	final public static int NOFLIP = 1;
	final int FLIPTIMEOUT = 750; // ms
	final String[] flipLabels = {"Flip", "NoFlip"};
	
	LinearLayout layout;
	
	boolean isRecognition = true;
	
	int label;
	
	SensorManager sensorManager;
	Sensor sensorAccel;
	Timer timer;

	TextView txtHandParts;
	
	float alpha = 1.0f;
	
	int fps = 0;
	long lastSecond = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		label = NOFLIP;
		xacFeatureMaker.createFeatureTable();
		xacFeatureMaker.setLabel(label);
		
		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorAccel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, sensorAccel,
				SensorManager.SENSOR_DELAY_UI);
		
		layout = new LinearLayout(this);
		layout.setBackgroundColor(Color.BLACK);
		
		layout.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				int numRowsToSend = PHONEACCELFPS * FLIPTIMEOUT / 1000;
				
				if(isRecognition) {
					label = doClassification(numRowsToSend);
//					setBackgroundColor(255 * (1 - label));
					if(label == 0) {
						txtHandParts.setText("Flip and tap");
					} else {
						txtHandParts.setText("Normal tap");
					}
					alpha = 1.0f;// * (1 - label);
				} else {
					if(xacFeatureMaker.sendOffData(numRowsToSend, flipLabels)) {
						xacFeatureMaker.clearData();
					}
				}
				return false;
			}
		});
		
		int widthTxtView = 1080;
		int heightTxtView = 750;
		txtHandParts = new TextView(this);
		txtHandParts.setId(1);
		txtHandParts.setTextSize(60);
		txtHandParts.setBackgroundColor(Color.BLACK);
		txtHandParts.setTextColor(Color.WHITE);
		txtHandParts.setText("Unknow");
		txtHandParts.layout(0, 0, widthTxtView, heightTxtView);
		txtHandParts.setGravity(Gravity.CENTER);
		
		LinearLayout.LayoutParams paramsText = new LinearLayout.LayoutParams(
				widthTxtView, heightTxtView);
		layout.addView(txtHandParts, paramsText);
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				// Your database code here
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if(isRecognition) {
							alpha *= 0.95f;
//							setBackgroundColor((int) (255 * (1 - label) * alpha));
							txtHandParts.setTextColor(Color.argb((int) (alpha * 255), 255,
									255, 255));
							
							if(alpha > 0.1f) {
								Log.d(LOGTAG, (int) (255 * (1 - label) * alpha)+"");
							}
						}
						
					}
				});
			}
		}, new Date(), 50);
		
		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.flip_sense, menu);
		return true;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_UP:
			if(!isRecognition) {
				toggleLabel();
			}
			break;
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			toggleMode();
			break;
		}

		return true;
	}
	
	private void toggleLabel() {
		label = label == FLIP ? NOFLIP : FLIP;
		if(label == FLIP) {
			Toast.makeText(this, "Training for flipping", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "Training for no flipping", Toast.LENGTH_SHORT).show();
		}
		
		setBackgroundColor(255 * (1 - label));
		xacFeatureMaker.setLabel(label);
	}
	
	private void toggleMode() {
		isRecognition = !isRecognition;
		
		if(isRecognition) {
			Toast.makeText(this, "Recognition mode", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "Training mode", Toast.LENGTH_SHORT).show();
		}
	}
	
	private int doClassification(int n) {
		int idxClass = 0;
		Object[] features = xacFeatureMaker.getFlattenedData(n);
		if (features != null) {
			try {
				idxClass = (int) FlipSenseClassifier.classify(features);		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return idxClass;
	}
	
	private void setBackgroundColor(int red) {
//		int bgColor = label == FLIP ? Color.argb(alpha, 255, 0, 0) : Color.argb(alpha, 0, 0, 0);
		int bgColor = Color.argb(255, red, 0, 0);
		layout.setBackgroundColor(bgColor);
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		
		xacFeatureMaker.updatePhoneAccel(event.values);
		xacFeatureMaker.addPhoneFeatureEntry();
		
//		Calendar lCDateTime = Calendar.getInstance();
//		long curTime = lCDateTime.getTimeInMillis();
//		if(curTime - lastSecond >= 1000) {
//			Log.d(LOGTAG, fps+"");
//			fps = 0;
//			lastSecond = curTime;
//		}
//		fps++;
	}
	
}
