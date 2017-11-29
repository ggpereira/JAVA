package word.destroyer.game;

import org.newdawn.slick.*; 
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {
	
	public static final String gameName = "Word Destroyer";
	public static final int startMenu = 0; 
	public static final int startLevel = 1;
	
	public Game(String gameName) throws SlickException
	{
		super(gameName);
		this.addState(new Menu(startMenu));
		this.addState(new Level1(startLevel));
	}
	
	public void initStatesList(GameContainer gc)throws SlickException
	{
		this.getState(startMenu).init(gc, this);
		this.getState(startLevel).init(gc, this);
		this.enterState(startMenu);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppGameContainer agc;
		try
		{
			agc = new AppGameContainer(new Game(gameName));
			agc.setDisplayMode(550, 700, false);
			agc.setTargetFrameRate(60);
			agc.start();
		}
		catch(SlickException ex)
		{
			ex.printStackTrace();
		}

	}

}
