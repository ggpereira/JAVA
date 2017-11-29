package word.destroyer.game;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Background extends Image
{
	private float posx = 0; 
	private float posy = 0; 
	private float velx = 0;
	private float vely = 0;
	private float acelx = 0; 
	private float acely = 0;
	
	public Background(String path, float velx, float vely, float acelx, float acely, float posx, float posy) throws SlickException
	{
		super(path);
		this.posx = posx; 
		this.posy = posy; 
		this.velx = velx; 
		this.vely = vely; 
		this.acelx = acelx; 
		this.acely = acely; 
	}
	
	
	public void setPosx(float pos_x)
	{
		posx = pos_x;
	}
	
	public void setPosy(float pos_y)
	{
		posy = pos_y;
	}
	
	public void setVelx(float velx)
	{
		this.velx = velx;
	}
	
	public void setVely(float vely)
	{
		this.vely = vely;
	}
	
	public void setAcelx(float acelx)
	{
		this.acelx = acelx;	
	}
	
	public void setAcely(float acely)
	{
		this.acely = acely;
	}
	
	public float getPosx()
	{
		return posx;
	}
	
	public float getPosy()
	{
		return posy;
	}
	
	public float moveX()
	{
		posx += velx * acelx; 
		return posx;
	}
	
	public float moveY()
	{
		posy += vely * acely;
		if(posy >= 700)
		{
			posy = 0;
		}
		
		return posy;
	}
	
	public void drawImage(float x, float y)
	{
		draw(x, y);
		
		if(y + 700 >= 0)
		{
			draw (x, y - 699);
		}
	}
	
}
