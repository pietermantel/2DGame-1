package dev.pietermantel.tools;

public class Clamp {
	public static float clamp(float x, float min, float max) {
		if(x < min) {
			return min;
		} else if(x > max) {
			return max;
		} else {
			return x;
		}
	}
}
