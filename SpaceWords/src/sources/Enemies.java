package sources;

import java.util.Collections;
import java.util.List;

import org.lwjgl.input.Keyboard;

import data.EnemyLoader;
import data.TargetState;

public class Enemies {
	private List<Enemy> enemies;
	
	public Enemies(int arg) {
		enemies = new EnemyLoader().selectLoad(arg);
	}
	
	public void draw() {
		for(Enemy current_enemy : enemies) {
			current_enemy.draw();
		}
	}
	
	public Enemy selectTarget() {
		if(!TargetState.getTargetState()) {
			for(Enemy current_enemy : enemies) {
				if(current_enemy.getEnemy().substring(0, 1).equalsIgnoreCase(Character.toString(Keyboard.getEventCharacter()))) {
					TargetState.targetLocked();
					current_enemy.isTarget();
					return current_enemy;
				}
			}
		}
		return null;
	}
	
	public void move() {
		Collections.sort(enemies);
		for(Enemy current_enemy : enemies) {
			current_enemy.move();
		}
	}
}
