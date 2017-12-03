package sources;

import java.util.Collection;

import data.EnemyLoader;

public class Enemies {
	private Collection<Enemy> enemies;
	
	public Enemies(int arg) {
		enemies = new EnemyLoader().selectLoad(0);
	}
	
	public void draw() {
		for(Enemy current_enemy : enemies) {
			current_enemy.draw();
		}
	}
	
	public void move() {
		for(Enemy current_enemy : enemies) {
			current_enemy.move();
		}
	}
}
