package sources;

import org.newdawn.slick.Image;

public class Background {
	private float x, y; 
	private float speed;
	private float accel;
	private Image image;
	
	public Background() {
		x = 0;
		y = 0; 
		speed = 0.9f;
		accel = 0.9f; 
		image = GameImage.loadImage("resources/img/background.png");
	}
	
	public void draw() {
		image.draw(x, y);
		if(y >= 0) {
			image.draw(x, y - 699);
		}
	}
	
	public void move() {
		y += accel * speed;
		if(y >= 700) {
			y = 0;
		}
	}
	
	
}
