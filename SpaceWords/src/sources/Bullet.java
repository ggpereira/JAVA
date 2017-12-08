package sources;

import org.newdawn.slick.Image;

import data.Calculator;
import data.Collider;

public class  Bullet {
	float x, y, speedy, speedx;
	Image bullet;
	Enemy target;
	public Bullet(Enemy target) {
		x = 575/2;
		y = 700 - 20;
		speedy = 7.0f;
		speedx = 2.0f;
		bullet = GameImage.loadImage("resources/img/bullet.png");
		this.target = target;
	}
	
	public boolean collide() {
		if(Collider.collide(x, y, target.getX(), target.getY(), true)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void update() {
		float angle = Calculator.angle(x, y, target.getX(), target.getY());
		x += speedx * Math.cos(angle);
		y += speedy * Math.sin(angle);
	}
	
	public void draw() {
		bullet.setRotation(Calculator.angle(x, y, target.getX(), target.getY()));
		bullet.drawCentered(x, y);
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
}
