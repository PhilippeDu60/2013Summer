package me.xiangchen.technique.doubleflip;

public class AuthenticSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [4];
	    sums[(int) AuthenticSenseClassifier_0.classify(i)] += 2.838315395940109;
	    sums[(int) AuthenticSenseClassifier_1.classify(i)] += 3.0937058791699674;
	    sums[(int) AuthenticSenseClassifier_2.classify(i)] += 2.7781316322865113;
	    sums[(int) AuthenticSenseClassifier_3.classify(i)] += 2.530836068006815;
	    sums[(int) AuthenticSenseClassifier_4.classify(i)] += 3.0033054841535525;
	    sums[(int) AuthenticSenseClassifier_5.classify(i)] += 2.8901511489436253;
	    sums[(int) AuthenticSenseClassifier_6.classify(i)] += 3.18682638871508;
	    sums[(int) AuthenticSenseClassifier_7.classify(i)] += 3.016354986964492;
	    sums[(int) AuthenticSenseClassifier_8.classify(i)] += 2.3230896906685543;
	    sums[(int) AuthenticSenseClassifier_9.classify(i)] += 2.12577918552415;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 4; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class AuthenticSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_0.N23feea1e245(i);
	    return p;
	  }
	  static double N23feea1e245(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 2;
	    } else if (((Double) i[161]).doubleValue() <= -3.68) {
	    p = AuthenticSenseClassifier_0.N34bc6a08246(i);
	    } else if (((Double) i[161]).doubleValue() > -3.68) {
	    p = AuthenticSenseClassifier_0.N7f057212248(i);
	    } 
	    return p;
	  }
	  static double N34bc6a08246(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() <= 0.15) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() > 0.15) {
	    p = AuthenticSenseClassifier_0.N3dd54e44247(i);
	    } 
	    return p;
	  }
	  static double N3dd54e44247(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= -1.99) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() > -1.99) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7f057212248(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= -3.06) {
	    p = AuthenticSenseClassifier_0.N3e843ce4249(i);
	    } else if (((Double) i[179]).doubleValue() > -3.06) {
	    p = AuthenticSenseClassifier_0.N5bb9bccc250(i);
	    } 
	    return p;
	  }
	  static double N3e843ce4249(Object []i) {
	    double p = Double.NaN;
	    if (i[130] == null) {
	      p = 1;
	    } else if (((Double) i[130]).doubleValue() <= 0.5) {
	      p = 1;
	    } else if (((Double) i[130]).doubleValue() > 0.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5bb9bccc250(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.35) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 9.35) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_1.N7f1a241f251(i);
	    return p;
	  }
	  static double N7f1a241f251(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 0;
	    } else if (((Double) i[178]).doubleValue() <= 0.92) {
	    p = AuthenticSenseClassifier_1.Nd39b06a252(i);
	    } else if (((Double) i[178]).doubleValue() > 0.92) {
	    p = AuthenticSenseClassifier_1.N24bec229256(i);
	    } 
	    return p;
	  }
	  static double Nd39b06a252(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 2;
	    } else if (((Double) i[161]).doubleValue() <= -5.67) {
	      p = 2;
	    } else if (((Double) i[161]).doubleValue() > -5.67) {
	    p = AuthenticSenseClassifier_1.N466d05ee253(i);
	    } 
	    return p;
	  }
	  static double N466d05ee253(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= -2.3) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() > -2.3) {
	    p = AuthenticSenseClassifier_1.N1fa07061254(i);
	    } 
	    return p;
	  }
	  static double N1fa07061254(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() <= -2.91) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() > -2.91) {
	    p = AuthenticSenseClassifier_1.N5e32007f255(i);
	    } 
	    return p;
	  }
	  static double N5e32007f255(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 9.6) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() > 9.6) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N24bec229256(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= 3.52) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() > 3.52) {
	      p = 3;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_2.N67bd2497257(i);
	    return p;
	  }
	  static double N67bd2497257(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 0;
	    } else if (((Double) i[158]).doubleValue() <= 10.42) {
	    p = AuthenticSenseClassifier_2.N32ad6ab6258(i);
	    } else if (((Double) i[158]).doubleValue() > 10.42) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N32ad6ab6258(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() <= -8.27) {
	    p = AuthenticSenseClassifier_2.N1738ecb8259(i);
	    } else if (((Double) i[161]).doubleValue() > -8.27) {
	    p = AuthenticSenseClassifier_2.N1a3d2ff1260(i);
	    } 
	    return p;
	  }
	  static double N1738ecb8259(Object []i) {
	    double p = Double.NaN;
	    if (i[166] == null) {
	      p = 2;
	    } else if (((Double) i[166]).doubleValue() <= -1.07) {
	      p = 2;
	    } else if (((Double) i[166]).doubleValue() > -1.07) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1a3d2ff1260(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 9.4) {
	    p = AuthenticSenseClassifier_2.N271684ac261(i);
	    } else if (((Double) i[8]).doubleValue() > 9.4) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N271684ac261(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() <= 10.4) {
	    p = AuthenticSenseClassifier_2.N37604c40262(i);
	    } else if (((Double) i[65]).doubleValue() > 10.4) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N37604c40262(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= -5.52) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() > -5.52) {
	    p = AuthenticSenseClassifier_2.N132e1a27263(i);
	    } 
	    return p;
	  }
	  static double N132e1a27263(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -10.9) {
	    p = AuthenticSenseClassifier_2.N37b70047264(i);
	    } else if (((Double) i[2]).doubleValue() > -10.9) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N37b70047264(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -11.9) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -11.9) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_3.N4f7351e4265(i);
	    return p;
	  }
	  static double N4f7351e4265(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 1;
	    } else if (((Double) i[178]).doubleValue() <= -4.29) {
	    p = AuthenticSenseClassifier_3.N1c05787c266(i);
	    } else if (((Double) i[178]).doubleValue() > -4.29) {
	    p = AuthenticSenseClassifier_3.N19ca19d8268(i);
	    } 
	    return p;
	  }
	  static double N1c05787c266(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() <= -6.28) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() > -6.28) {
	    p = AuthenticSenseClassifier_3.N2b292343267(i);
	    } 
	    return p;
	  }
	  static double N2b292343267(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= 1.99) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() > 1.99) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N19ca19d8268(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 2;
	    } else if (((Double) i[169]).doubleValue() <= -1.07) {
	      p = 2;
	    } else if (((Double) i[169]).doubleValue() > -1.07) {
	    p = AuthenticSenseClassifier_3.N2366c122269(i);
	    } 
	    return p;
	  }
	  static double N2366c122269(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 3;
	    } else if (((Double) i[124]).doubleValue() <= -0.3) {
	      p = 3;
	    } else if (((Double) i[124]).doubleValue() > -0.3) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_4.N2f11b156270(i);
	    return p;
	  }
	  static double N2f11b156270(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() <= -3.22) {
	    p = AuthenticSenseClassifier_4.N32919d3e271(i);
	    } else if (((Double) i[161]).doubleValue() > -3.22) {
	    p = AuthenticSenseClassifier_4.N712fe9c1273(i);
	    } 
	    return p;
	  }
	  static double N32919d3e271(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= 0.61) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() > 0.61) {
	    p = AuthenticSenseClassifier_4.N75ea6b61272(i);
	    } 
	    return p;
	  }
	  static double N75ea6b61272(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() <= -2.76) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() > -2.76) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N712fe9c1273(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -0.6) {
	    p = AuthenticSenseClassifier_4.N9bb7f5274(i);
	    } else if (((Double) i[2]).doubleValue() > -0.6) {
	    p = AuthenticSenseClassifier_4.N6f4a3622275(i);
	    } 
	    return p;
	  }
	  static double N9bb7f5274(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 1;
	    } else if (((Double) i[178]).doubleValue() <= 2.15) {
	      p = 1;
	    } else if (((Double) i[178]).doubleValue() > 2.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6f4a3622275(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 1;
	    } else if (((Double) i[173]).doubleValue() <= -4.9) {
	      p = 1;
	    } else if (((Double) i[173]).doubleValue() > -4.9) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_5.N71282b42276(i);
	    return p;
	  }
	  static double N71282b42276(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 0;
	    } else if (((Double) i[178]).doubleValue() <= 0.31) {
	    p = AuthenticSenseClassifier_5.N4303418277(i);
	    } else if (((Double) i[178]).doubleValue() > 0.31) {
	    p = AuthenticSenseClassifier_5.N302e71fc280(i);
	    } 
	    return p;
	  }
	  static double N4303418277(Object []i) {
	    double p = Double.NaN;
	    if (i[176] == null) {
	      p = 1;
	    } else if (((Double) i[176]).doubleValue() <= -2.45) {
	      p = 1;
	    } else if (((Double) i[176]).doubleValue() > -2.45) {
	    p = AuthenticSenseClassifier_5.N78ac15cd278(i);
	    } 
	    return p;
	  }
	  static double N78ac15cd278(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() <= 9.1) {
	    p = AuthenticSenseClassifier_5.N69cb839f279(i);
	    } else if (((Double) i[95]).doubleValue() > 9.1) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N69cb839f279(Object []i) {
	    double p = Double.NaN;
	    if (i[172] == null) {
	      p = 0;
	    } else if (((Double) i[172]).doubleValue() <= 0.46) {
	      p = 0;
	    } else if (((Double) i[172]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N302e71fc280(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= 1.38) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() > 1.38) {
	      p = 3;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_6.N393d701a281(i);
	    return p;
	  }
	  static double N393d701a281(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 2;
	    } else if (((Double) i[161]).doubleValue() <= -5.82) {
	    p = AuthenticSenseClassifier_6.N708ad851282(i);
	    } else if (((Double) i[161]).doubleValue() > -5.82) {
	    p = AuthenticSenseClassifier_6.N5a3bb53f284(i);
	    } 
	    return p;
	  }
	  static double N708ad851282(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 2;
	    } else if (((Double) i[151]).doubleValue() <= 0.15) {
	      p = 2;
	    } else if (((Double) i[151]).doubleValue() > 0.15) {
	    p = AuthenticSenseClassifier_6.N2b7fe790283(i);
	    } 
	    return p;
	  }
	  static double N2b7fe790283(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 0.2) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 0.2) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5a3bb53f284(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 1;
	    } else if (((Double) i[155]).doubleValue() <= -3.22) {
	    p = AuthenticSenseClassifier_6.N5f86961285(i);
	    } else if (((Double) i[155]).doubleValue() > -3.22) {
	    p = AuthenticSenseClassifier_6.N77ce6256286(i);
	    } 
	    return p;
	  }
	  static double N5f86961285(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 3;
	    } else if (((Double) i[156]).doubleValue() <= -1.69) {
	      p = 3;
	    } else if (((Double) i[156]).doubleValue() > -1.69) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N77ce6256286(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 10.0) {
	    p = AuthenticSenseClassifier_6.Ne9a398d287(i);
	    } else if (((Double) i[71]).doubleValue() > 10.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Ne9a398d287(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= -3.98) {
	    p = AuthenticSenseClassifier_6.N2f385f78288(i);
	    } else if (((Double) i[179]).doubleValue() > -3.98) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2f385f78288(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 1;
	    } else if (((Double) i[113]).doubleValue() <= 11.0) {
	      p = 1;
	    } else if (((Double) i[113]).doubleValue() > 11.0) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_7.N1e03d780289(i);
	    return p;
	  }
	  static double N1e03d780289(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() <= 0.0) {
	    p = AuthenticSenseClassifier_7.Ne3923e5290(i);
	    } else if (((Double) i[178]).doubleValue() > 0.0) {
	    p = AuthenticSenseClassifier_7.N5ff8cef293(i);
	    } 
	    return p;
	  }
	  static double Ne3923e5290(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= 7.51) {
	    p = AuthenticSenseClassifier_7.N496396ae291(i);
	    } else if (((Double) i[179]).doubleValue() > 7.51) {
	    p = AuthenticSenseClassifier_7.N29399f26292(i);
	    } 
	    return p;
	  }
	  static double N496396ae291(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 7.35) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 7.35) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N29399f26292(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= 8.7) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > 8.7) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5ff8cef293(Object []i) {
	    double p = Double.NaN;
	    if (i[110] == null) {
	      p = 0;
	    } else if (((Double) i[110]).doubleValue() <= 6.9) {
	      p = 0;
	    } else if (((Double) i[110]).doubleValue() > 6.9) {
	    p = AuthenticSenseClassifier_7.N4c7da1fc294(i);
	    } 
	    return p;
	  }
	  static double N4c7da1fc294(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() <= 3.37) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() > 3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_8.N4c15ce9f295(i);
	    return p;
	  }
	  static double N4c15ce9f295(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 1;
	    } else if (((Double) i[178]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_8.N2bb04fbf296(i);
	    } else if (((Double) i[178]).doubleValue() > 0.46) {
	    p = AuthenticSenseClassifier_8.N4f5faa7c301(i);
	    } 
	    return p;
	  }
	  static double N2bb04fbf296(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -0.1) {
	    p = AuthenticSenseClassifier_8.N44439b01297(i);
	    } else if (((Double) i[3]).doubleValue() > -0.1) {
	    p = AuthenticSenseClassifier_8.N4093d9c7299(i);
	    } 
	    return p;
	  }
	  static double N44439b01297(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() <= 1.1) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() > 1.1) {
	    p = AuthenticSenseClassifier_8.N327581aa298(i);
	    } 
	    return p;
	  }
	  static double N327581aa298(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() <= 1.07) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() > 1.07) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4093d9c7299(Object []i) {
	    double p = Double.NaN;
	    if (i[176] == null) {
	      p = 1;
	    } else if (((Double) i[176]).doubleValue() <= 7.66) {
	    p = AuthenticSenseClassifier_8.N2abeb8f0300(i);
	    } else if (((Double) i[176]).doubleValue() > 7.66) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N2abeb8f0300(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() <= 0.5) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() > 0.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4f5faa7c301(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() <= -9.35) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_8.N11b1db9a302(i);
	    } 
	    return p;
	  }
	  static double N11b1db9a302(Object []i) {
	    double p = Double.NaN;
	    if (i[175] == null) {
	      p = 3;
	    } else if (((Double) i[175]).doubleValue() <= 2.45) {
	      p = 3;
	    } else if (((Double) i[175]).doubleValue() > 2.45) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_9.N33c86489303(i);
	    return p;
	  }
	  static double N33c86489303(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 12.7) {
	    p = AuthenticSenseClassifier_9.N294078ee304(i);
	    } else if (((Double) i[5]).doubleValue() > 12.7) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N294078ee304(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() <= 11.0) {
	    p = AuthenticSenseClassifier_9.N47c3666a305(i);
	    } else if (((Double) i[104]).doubleValue() > 11.0) {
	    p = AuthenticSenseClassifier_9.N7cb7d0ec309(i);
	    } 
	    return p;
	  }
	  static double N47c3666a305(Object []i) {
	    double p = Double.NaN;
	    if (i[167] == null) {
	      p = 3;
	    } else if (((Double) i[167]).doubleValue() <= -9.35) {
	      p = 3;
	    } else if (((Double) i[167]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_9.N6d78ddf4306(i);
	    } 
	    return p;
	  }
	  static double N6d78ddf4306(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 13.1) {
	    p = AuthenticSenseClassifier_9.N1a33f652307(i);
	    } else if (((Double) i[23]).doubleValue() > 13.1) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N1a33f652307(Object []i) {
	    double p = Double.NaN;
	    if (i[167] == null) {
	      p = 0;
	    } else if (((Double) i[167]).doubleValue() <= 10.27) {
	    p = AuthenticSenseClassifier_9.N49708eee308(i);
	    } else if (((Double) i[167]).doubleValue() > 10.27) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N49708eee308(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() <= 10.3) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() > 10.3) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7cb7d0ec309(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= -0.3) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > -0.3) {
	      p = 2;
	    } 
	    return p;
	  }
	}