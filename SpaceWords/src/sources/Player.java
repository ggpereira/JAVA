package sources;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Image;


import data.Calculator;
import data.KeyPressed;


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
		img_player.setCenterOfRotation(275, 680);
		img_player.setRotation(270);
	
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
	
	public String shoot() {
		String key = KeyPressed.getCharKey();
		if(key.equals("vazio")) {
			return key;
		}
		return "vazio";
	}
	
	public int getLives() {
		return lives;
	}
	
	public void storeLive() {
		if(score.getPoints() >= 200) {
			lives += 1;
		}
	}
	
	public void rotate(Enemy target) {
		img_player.setRotation(Calculator.angle(x, y, target.getX(), target.getY()));
		
	}
	
	public void draw() {
		img_player.drawCentered(x, y);
	}
	
}
