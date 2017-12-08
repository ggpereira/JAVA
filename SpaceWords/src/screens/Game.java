package screens;




import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import data.GameManager;
import data.KeyPressed;
import sources.Background;
import sources.Enemies;
import sources.Enemy;
import sources.Player;
import sources.Target;

public class Game extends BasicGameState{
	Background game_bg;
	Player player;
	Enemies enemies;
	Target target = null;
	String key;
	GameManager gm;
	
	public Game(int GAME)
	{
		
	}


	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		game_bg = new Background();
		player = new Player();
		enemies = new Enemies(0);
		gm = new GameManager(target, enemies, player);
		
	}


	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		game_bg.draw();
		player.draw();
		player.score.draw();
		enemies.draw();
		
	}


	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		KeyPressed.setInput(gc.getInput());
		key = KeyPressed.getCharKey();
		gm.setTarget(target);
		
		if(!key.equals("vazio")) {
			if(gm.targetWait()) {
				for(Enemy current_en : enemies.getEnemies()) {
					if(current_en.getEnemy().substring(0, 1).equalsIgnoreCase(key)) {
						current_en.hit();
						target = new Target(current_en);
						break;
					}
				}
			}else {
				if(!target.isEmpty()) {
					target.setKey(key);
					if(target.targetSuccess()) {
						target.destroy();
					}
				}
			}
		}
				
		game_bg.move();
		enemies.move();
	}


	public int getID() {

		return 3;
	}
	
}
