package me.xiangchen.technique.flipsense;

public class FlipSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) FlipSenseClassifier_0.classify(i)] += 3.0155349008501706;
	    sums[(int) FlipSenseClassifier_1.classify(i)] += 2.3978952727983645;
	    sums[(int) FlipSenseClassifier_2.classify(i)] += 2.719131705406914;
	    sums[(int) FlipSenseClassifier_3.classify(i)] += 3.4495955426905356;
	    sums[(int) FlipSenseClassifier_4.classify(i)] += 2.7206458748092968;
	    sums[(int) FlipSenseClassifier_5.classify(i)] += 2.854326095425519;
	    sums[(int) FlipSenseClassifier_6.classify(i)] += 2.7331741621063097;
	    sums[(int) FlipSenseClassifier_7.classify(i)] += 2.98190956296014;
	    sums[(int) FlipSenseClassifier_8.classify(i)] += 2.297358926901247;
	    sums[(int) FlipSenseClassifier_9.classify(i)] += 2.05222665220725;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class FlipSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_0.N24360ac1353(i);
	    return p;
	  }
	  static double N24360ac1353(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() <= 4.9) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() > 4.9) {
	    p = FlipSenseClassifier_0.N57fc1779354(i);
	    } 
	    return p;
	  }
	  static double N57fc1779354(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -0.46) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_1.N6769360f355(i);
	    return p;
	  }
	  static double N6769360f355(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -5.82) {
	    p = FlipSenseClassifier_1.N2c5c47d3356(i);
	    } else if (((Double) i[121]).doubleValue() > -5.82) {
	    p = FlipSenseClassifier_1.N5e6f8465357(i);
	    } 
	    return p;
	  }
	  static double N2c5c47d3356(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -5.06) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -5.06) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5e6f8465357(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 0;
	    } else if (((Double) i[48]).doubleValue() <= 0.61) {
	      p = 0;
	    } else if (((Double) i[48]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_2.N6b5d3352358(i);
	    return p;
	  }
	  static double N6b5d3352358(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.7) {
	    p = FlipSenseClassifier_2.N33d4838f359(i);
	    } else if (((Double) i[5]).doubleValue() > 9.7) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N33d4838f359(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -3.06) {
	    p = FlipSenseClassifier_2.N45093bde360(i);
	    } else if (((Double) i[121]).doubleValue() > -3.06) {
	    p = FlipSenseClassifier_2.N9ea5ab4362(i);
	    } 
	    return p;
	  }
	  static double N45093bde360(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 1;
	    } else if (((Double) i[118]).doubleValue() <= -3.37) {
	    p = FlipSenseClassifier_2.N61398f3a361(i);
	    } else if (((Double) i[118]).doubleValue() > -3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N61398f3a361(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -7.81) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -7.81) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N9ea5ab4362(Object []i) {
	    double p = Double.NaN;
	    if (i[33] == null) {
	      p = 1;
	    } else if (((Double) i[33]).doubleValue() <= -0.34) {
	      p = 1;
	    } else if (((Double) i[33]).doubleValue() > -0.34) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_3.N78e8e481363(i);
	    return p;
	  }
	  static double N78e8e481363(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 6.28) {
	    p = FlipSenseClassifier_3.N1f20f2b364(i);
	    } 
	    return p;
	  }
	  static double N1f20f2b364(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -2.3) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -2.3) {
	    p = FlipSenseClassifier_3.N3ac1d10c365(i);
	    } 
	    return p;
	  }
	  static double N3ac1d10c365(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 0;
	    } else if (((Double) i[75]).doubleValue() <= 0.13) {
	    p = FlipSenseClassifier_3.Na8388f7366(i);
	    } else if (((Double) i[75]).doubleValue() > 0.13) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Na8388f7366(Object []i) {
	    double p = Double.NaN;
	    if (i[34] == null) {
	      p = 0;
	    } else if (((Double) i[34]).doubleValue() <= 2.18) {
	      p = 0;
	    } else if (((Double) i[34]).doubleValue() > 2.18) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_4.N41951585367(i);
	    return p;
	  }
	  static double N41951585367(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 7.51) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 7.51) {
	    p = FlipSenseClassifier_4.N22b7f066368(i);
	    } 
	    return p;
	  }
	  static double N22b7f066368(Object []i) {
	    double p = Double.NaN;
	    if (i[110] == null) {
	      p = 0;
	    } else if (((Double) i[110]).doubleValue() <= 8.66) {
	      p = 0;
	    } else if (((Double) i[110]).doubleValue() > 8.66) {
	    p = FlipSenseClassifier_4.N5a07ca58369(i);
	    } 
	    return p;
	  }
	  static double N5a07ca58369(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -2.15) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -2.15) {
	    p = FlipSenseClassifier_4.N35758595370(i);
	    } 
	    return p;
	  }
	  static double N35758595370(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 1;
	    } else if (((Double) i[118]).doubleValue() <= -4.29) {
	      p = 1;
	    } else if (((Double) i[118]).doubleValue() > -4.29) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_5.N3695149e371(i);
	    return p;
	  }
	  static double N3695149e371(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= 8.27) {
	    p = FlipSenseClassifier_5.N757cad10372(i);
	    } else if (((Double) i[119]).doubleValue() > 8.27) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N757cad10372(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() <= 6.9) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() > 6.9) {
	    p = FlipSenseClassifier_5.N4c4631b2373(i);
	    } 
	    return p;
	  }
	  static double N4c4631b2373(Object []i) {
	    double p = Double.NaN;
	    if (i[21] == null) {
	      p = 0;
	    } else if (((Double) i[21]).doubleValue() <= 0.65) {
	    p = FlipSenseClassifier_5.N1468c43d374(i);
	    } else if (((Double) i[21]).doubleValue() > 0.65) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1468c43d374(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() <= -1.01) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() > -1.01) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_6.N6a2b8b42375(i);
	    return p;
	  }
	  static double N6a2b8b42375(Object []i) {
	    double p = Double.NaN;
	    if (i[129] == null) {
	      p = 1;
	    } else if (((Double) i[129]).doubleValue() <= -0.77) {
	      p = 1;
	    } else if (((Double) i[129]).doubleValue() > -0.77) {
	    p = FlipSenseClassifier_6.N50c3d082376(i);
	    } 
	    return p;
	  }
	  static double N50c3d082376(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() <= 0.45) {
	    p = FlipSenseClassifier_6.N67ae303a377(i);
	    } else if (((Double) i[72]).doubleValue() > 0.45) {
	    p = FlipSenseClassifier_6.N19663589381(i);
	    } 
	    return p;
	  }
	  static double N67ae303a377(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 0;
	    } else if (((Double) i[83]).doubleValue() <= 9.54) {
	    p = FlipSenseClassifier_6.N5ce06503378(i);
	    } else if (((Double) i[83]).doubleValue() > 9.54) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5ce06503378(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 0;
	    } else if (((Double) i[66]).doubleValue() <= 0.59) {
	    p = FlipSenseClassifier_6.N1007d798379(i);
	    } else if (((Double) i[66]).doubleValue() > 0.59) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1007d798379(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -4.14) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() > -4.14) {
	    p = FlipSenseClassifier_6.N72db4460380(i);
	    } 
	    return p;
	  }
	  static double N72db4460380(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 1.07) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 1.07) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N19663589381(Object []i) {
	    double p = Double.NaN;
	    if (i[101] == null) {
	      p = 1;
	    } else if (((Double) i[101]).doubleValue() <= 9.21) {
	      p = 1;
	    } else if (((Double) i[101]).doubleValue() > 9.21) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_7.N544c266382(i);
	    return p;
	  }
	  static double N544c266382(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -7.66) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -7.66) {
	    p = FlipSenseClassifier_7.N6536b93d383(i);
	    } 
	    return p;
	  }
	  static double N6536b93d383(Object []i) {
	    double p = Double.NaN;
	    if (i[117] == null) {
	      p = 1;
	    } else if (((Double) i[117]).doubleValue() <= 3.37) {
	    p = FlipSenseClassifier_7.N6bbb87b4384(i);
	    } else if (((Double) i[117]).doubleValue() > 3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6bbb87b4384(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.66) {
	    p = FlipSenseClassifier_7.N64ca71ad385(i);
	    } else if (((Double) i[5]).doubleValue() > 9.66) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N64ca71ad385(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 1;
	    } else if (((Double) i[118]).doubleValue() <= -3.37) {
	    p = FlipSenseClassifier_7.N26ed488d386(i);
	    } else if (((Double) i[118]).doubleValue() > -3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N26ed488d386(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 1;
	    } else if (((Double) i[113]).doubleValue() <= -5.21) {
	    p = FlipSenseClassifier_7.N243634f2387(i);
	    } else if (((Double) i[113]).doubleValue() > -5.21) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N243634f2387(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 0;
	    } else if (((Double) i[19]).doubleValue() <= 2.54) {
	      p = 0;
	    } else if (((Double) i[19]).doubleValue() > 2.54) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_8.N62ce0e70388(i);
	    return p;
	  }
	  static double N62ce0e70388(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -9.35) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -9.35) {
	    p = FlipSenseClassifier_8.N46160dbd389(i);
	    } 
	    return p;
	  }
	  static double N46160dbd389(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() <= 2.91) {
	    p = FlipSenseClassifier_8.N51e0173d390(i);
	    } else if (((Double) i[114]).doubleValue() > 2.91) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N51e0173d390(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 9.33) {
	    p = FlipSenseClassifier_8.N4f15cfc9391(i);
	    } else if (((Double) i[8]).doubleValue() > 9.33) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4f15cfc9391(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() <= 7.51) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() > 7.51) {
	    p = FlipSenseClassifier_8.N20fcbdaf392(i);
	    } 
	    return p;
	  }
	  static double N20fcbdaf392(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -1.69) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -1.69) {
	    p = FlipSenseClassifier_8.N31093d14393(i);
	    } 
	    return p;
	  }
	  static double N31093d14393(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 8.85) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() > 8.85) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_9.N55890532394(i);
	    return p;
	  }
	  static double N55890532394(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -2.91) {
	    p = FlipSenseClassifier_9.N16b4417d395(i);
	    } else if (((Double) i[121]).doubleValue() > -2.91) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N16b4417d395(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 1;
	    } else if (((Double) i[124]).doubleValue() <= -2.3) {
	    p = FlipSenseClassifier_9.N14378130396(i);
	    } else if (((Double) i[124]).doubleValue() > -2.3) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N14378130396(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -7.81) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -7.81) {
	      p = 1;
	    } 
	    return p;
	  }
	}