package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import data.KeyPressed;
import sources.Background;
import sources.Enemies;
import sources.Player;
import sources.Target;

public class Game extends BasicGameState{
	Background game_bg;
	Player player;
	Enemies enemies;
	Target target;
	
	public Game(int GAME)
	{
		
	}


	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		game_bg = new Background();
		player = new Player();
		enemies = new Enemies(0);	
		target = new Target(enemies.getEnemies());
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
		
		/*Input*/
		KeyPressed.setInput(gc.getInput());
		String key = KeyPressed.getCharKey();
		
		
		
		if(!key.equalsIgnoreCase("vazio")) {
		
			if(target.nextTarget()) {
				target.setTarget(key);
			}
			else {
				target.hitTarget(key);
			}
		}
		
		if(target.getTarget() != null) {
			player.rotate(target.getTarget());
		}
		
	
	}


	public int getID() {

		return 3;
	}
	
}
