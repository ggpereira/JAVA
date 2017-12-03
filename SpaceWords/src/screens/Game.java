package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import sources.Background;
import sources.Enemies;
import sources.Player;

public class Game extends BasicGameState{
	Background game_bg;
	Player player;
	Enemies enemies;
	
	public Game(int GAME)
	{
		
	}


	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		game_bg = new Background();
		player = new Player();
		enemies = new Enemies(0);
	}


	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		game_bg.draw();
		player.draw();
		player.score.draw();
		enemies.draw();
	}


	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		game_bg.move();
		enemies.move();
		enemies.selectTarget();
	}


	public int getID() {

		return 3;
	}
	
}
