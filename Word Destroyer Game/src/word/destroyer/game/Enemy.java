package word.destroyer.game;



public class Enemy {
	
	private float posx; 
	private float posy;
	private float velx; 
	private float vely; 
	private float acelx; 
	private float acely;
	private String word;
	
	public Enemy(String word, float posx, float posy, float velx, float vely, float acelx, float acely)
	{
		setString(word);
		setPosx(posx); 
		setPosy(posy); 
		setVelx(velx);
		setVely(vely);
		setAcelx(acelx);
		setAcely(acely); 
	}
	
	public void setPosx(float posx)
	{
		this.posx = posx; 
	}
	
	public void setPosy(float posy)
	{
		this.posy = posy; 
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
	
	public void move()
	{
		posx += velx * acelx;
		posy += vely * acely;
	}
	
	public void setString(String word)
	{
		this.word = word;
	}
	
	public String getString()
	{
		return word;
	}
	
	
}
