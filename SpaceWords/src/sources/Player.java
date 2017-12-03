package sources;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Image;


public class Player {
	private static String PATH = "resources/img/nave.png";
	private static float WIDTH = 550, HEIGHT = 700;
	private String name;
	private float x, y, rotation;
    public Score score;
	private int lives;
	Image img_player;
	
	public Player()
	{
		x = WIDTH/2; 
		y = HEIGHT - 20;
		lives = 3; 
		rotation = 0;
		score = new Score();
		img_player = GameImage.loadImage(PATH);
	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getX()
	{
		return x; 
	}
	
	public float getY()
	{
		return y;
	}
	
	public void hit()
	{
		lives -= 1;
	}
	
	public int getLives() {
		return lives;
	}
	
	public void storeLive() {
		if(score.getPoints() >= 200) {
			lives += 1;
		}
	}
	
	public void draw() {
		img_player.drawCentered(x, y);
	}
	
}
