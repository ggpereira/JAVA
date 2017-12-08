package data;

public class Collider {
	
	public static boolean collide(float x1, float y1, float x2, float y2, boolean vertical) {
		if(vertical) {
			if((y2 - y1) <= 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if((x2 - x1) == 0 && (y2 - y1) == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
}
