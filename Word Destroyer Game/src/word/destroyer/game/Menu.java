package word.destroyer.game;

import org.newdawn.slick.*; 
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{
	
	public Menu(int startmenu)
	{
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
	{
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
	{
		g.drawString("Play", 240, 300);
		g.drawString("Ranking", 230, 400);
		g.drawString("Exit", 240, 500);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		int posX = Mouse.getX();
		int posY = Mouse.getY(); 
		/*Play*/
	    if((posX > 240 && posX < 275) && (posY < 397 && posY > 388))
	    {
	    	if(Mouse.isButtonDown(0))
	    	{
	    		sbg.enterState(1);
	    	}
	    }
	    /*Exit*/
	    if((posX > 238 && posX < 275) && (posY < 198 && posY > 185))
	    {
	    	if(Mouse.isButtonDown(0))
	    	{
	    		System.exit(0);
	    	}
	    }
	}
	
	public int getID()
	{
		return 0;
	}

}
