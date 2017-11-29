package word.destroyer.game;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player extends Image
{
	private int lifes = 1; 
	protected float posx = 550/2; 
	protected float posy = 650;
	protected float rotation = 0;
	private int combo = 1;
	Graphics g = new Graphics();
	
	public Player(String path) throws SlickException
	{
		super(path);
	}
	
	public float getPosx()
	{
		return posx;
	}
	
	public float getPosy()
	{
		return posy; 
	}
	
	public float getLifes()
	{
		return lifes;
	}
	
	public void setRotation(float rotation)
	{
		this.rotation = rotation;
	}
	
	public float getRotation()
	{
		return rotation;
	}
	
	public void centerRotation()
	{
		super.setCenterOfRotation(posx, posy);
	}
	
	public void incrementCombo()
	{
		combo++;
	}
	
	public void restartCombo()
	{
		combo = 1;
	}
	
	
	public int getCombo()
	{
		return combo; 
	}
	
	public void drawPlayer()
	{
		super.drawCentered(posx, posy);
	}
	
	
}
