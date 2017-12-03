package sources;

import org.newdawn.slick.Color;

public class Enemy implements Comparable<Enemy>{
	private float x, y, speedx, speedy, accelx, accely; 
	private boolean destroyed, target;
	private StringBuilder enemy;
	private GameFont font;
	
	public Enemy(float x, float y, float speedx, float speedy, String word) {
		this.speedy = speedy;
		this.speedx = speedx;
		this.x = x;
		this.y = y;
		accelx = 1; 
		accely = 1;
		destroyed = false;
		target = false;
		enemy  = new StringBuilder(word);
		font = new GameFont("resources/fonts/Exo.ttf", 16f);
	}
	
	public void move() {
		if(x < 250) {
			accelx = 1;
		}
		if(x > 300) {
			accelx = -1;
		}
		
		x += (speedx*accelx);
		y += (speedy*accely);
	}
	
	public void draw() {
		if(target == true) {
			font.getFont().drawString(x, y, enemy.toString(), Color.orange);
		}
		else{
			font.getFont().drawString(x, y, enemy.toString());
		}
	}
	
	public void hit() {
		if(!destroyed) {
			enemy.deleteCharAt(0);
		}
	}
	
	public void isTarget() {
		target = true;
	}
	
	public boolean destroyed() {
		if(enemy.length() == 0) {
			destroyed = true;
			target = false;
		}
		return destroyed;
	}
	
	public String getEnemy() {
		return enemy.toString();
	}
	
	public float getY() {
		return y;
	}
	
	public float getX() {
		return x;
	}

	@Override
	public int compareTo(Enemy otherEnemy) {
		if(this.y > otherEnemy.getY()) {
			return -1;
		}
		if(this.y < otherEnemy.getY()) {
			return 1;
		}
		return 0;
	}
	
}
