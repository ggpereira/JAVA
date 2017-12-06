package sources;

import java.util.List;


public class Target {
	List <Enemy> enemies;
	Enemy current_target = null;
	
	public Target(List <Enemy> e) {
		enemies = e;
	}
	/*Select current enemy*/
	public void setTarget(String key) {
		for(Enemy current_enemy : enemies) {
			if(current_enemy.getEnemy().substring(0, 1).equalsIgnoreCase(key)) {
				current_enemy.isTarget();
				current_enemy.hit();
				current_target = current_enemy;
				break;
			}
		}
	}
	
	public Enemy getTarget() {
		return current_target;
	}
	
	/*Destroy target*/
	public void hitTarget(String key) {
		if(!targetIsEmpty()) {
			if(current_target.getEnemy().substring(0, 1).equalsIgnoreCase(key)) {
				current_target.hit();
			}
		}
	}

	public boolean targetIsEmpty() {
		System.out.println(current_target.getEnemy().length() + " " + current_target.getEnemy());
		if(current_target.getEnemy().length() == 1) {
			enemies.remove(current_target);
			current_target = null;
			return true;
		}
		return false;
	}
	
	/*Verifies if a new enemy can be selected*/
	public boolean nextTarget() {
		if(current_target == null) {
			return true;
		}
		return false;
	}

	
}
