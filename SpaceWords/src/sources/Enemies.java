package sources;

import java.util.Collections;
import java.util.List;


import data.EnemyLoader;


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
	
	public void move() {
		Collections.sort(enemies);
		for(Enemy current_enemy : enemies) {
			current_enemy.move();
		}
	}
	
	public List<Enemy> getEnemies() {
		return enemies;
	}
}
