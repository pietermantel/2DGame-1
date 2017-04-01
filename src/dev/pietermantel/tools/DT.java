package dev.pietermantel.tools;

public class DT {
	public static float pixWidth;
	public static void setDisplaySize(int width, int height, float ratio, int intWidth) {
		float a = width * ratio;
		boolean b;
		if(height >= a) {
			b = false;
		} else {
			b = true;
		}
		
		if(b) {
			pixWidth = width / intWidth;
		} else {
			pixWidth = height * ratio / intWidth;
		}
		System.out.println(b);
	}
	
	public static double getPix(int pix) {
		return pix * pixWidth;
	}
}
