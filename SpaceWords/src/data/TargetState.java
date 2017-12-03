package data;

public class TargetState {
	private static boolean targetState;
	
	public TargetState() {
		targetState = false;
	}
	
	public static void targetLocked() {
		targetState = true;
	}
	
	public static void targetUnlocked() {
		targetState = true;
	}
	
	public static boolean getTargetState() {
		return targetState;
	}
	
}
