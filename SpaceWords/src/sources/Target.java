package sources;

import org.lwjgl.input.Keyboard;

public class Target {
	Enemy target;
	
	public Target(Enemy enemy) {
		target = enemy;
	}
	
	public void hit() {
		if(Keyboard.getEventKeyState()) {
			if(target.getEnemy().equals(Character.toString(Keyboard.getEventCharacter()))) {
				target.hit();
			}
		}
	}
}
