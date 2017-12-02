package data;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import screens.Credits;
import screens.Game;
import screens.Menu;
import screens.Ranking;

public class Boot extends StateBasedGame{
	
	public static final String GAME_NAME = "Space Words";
	public static final int WIDTH = 550, HEIGHT = 700;
	public static final int GAME = 3, MAIN_MENU = 0, RANKING = 1, CREDITS = 2;
	
	
	public Boot(String name) {
		super(GAME_NAME);
		this.addState(new Menu(MAIN_MENU));
		this.addState(new Ranking(RANKING));
		this.addState(new Game(GAME));
		this.addState(new Credits(CREDITS));
	}
	
	public void initStatesList(GameContainer gc)throws SlickException{
		this.getState(MAIN_MENU).init(gc, this);;
		this.getState(RANKING).init(gc, this);
		this.getState(CREDITS).init(gc, this);;
		this.getState(GAME).init(gc, this);
		this.enterState(MAIN_MENU);
	}
	
	public static void main(String[] args) {
		AppGameContainer agc; 
		try {
			agc = new AppGameContainer(new Boot(GAME_NAME));
			agc.setDisplayMode(WIDTH, HEIGHT, false);
			agc.setTargetFrameRate(60);
			agc.setShowFPS(false);
			agc.start();
		}catch(SlickException ex) {
			ex.printStackTrace();
		}
	}

	
	
}
