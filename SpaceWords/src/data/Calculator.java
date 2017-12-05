package data;


public class Calculator {
	
	public static float angle(float x1, float y1, float x2, float y2) {
		float deltaY = 	(y2 - y1);
		float deltaX = 	(x2 - x1);
		float result = (float)Math.toDegrees(Math.atan2(deltaY, deltaX));
		return result;
	}
}
