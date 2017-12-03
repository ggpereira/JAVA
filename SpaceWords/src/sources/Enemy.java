package sources;

import org.newdawn.slick.Color;

public class Enemy {
	private float x, y, speedx, speedy, accelx, accely; 
	private boolean destroyed;
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
		font.getFont().drawString(x, y, enemy.toString(), Color.orange);
	}
	
	public void hit() {
		if(!destroyed) {
			enemy.deleteCharAt(0);
		}
	}
	
	public boolean destroyed() {
		if(enemy.length() == 0) {
			destroyed = true;
		}
		return destroyed;
	}
	
}
