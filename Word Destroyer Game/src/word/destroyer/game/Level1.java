package word.destroyer.game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import java.util.Collection;


public class Level1 extends BasicGameState{
	
	Background bg;
	Enemy enemy;
	Image image;
	Sound music;
	Player player;
	Score scr; 
	Collection<Enemy> enemies;
	Target target;
	@SuppressWarnings("unused")
	private Input input;
	@SuppressWarnings("unused")
	private KeyPressed keyPressed;
	String key;
		
	public Level1(int level1) throws SlickException
	{
		
		
	}

	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		// TODO Auto-generated method stub
		bg = new Background("res/bglevel1.png", 0, 0.5f, 0, 0.5f, 0, 0);
		player = new Player("res/nave.png");
		keyPressed = new KeyPressed();
		//enemies = EnemyGenerator.generateEnemy("res/teste1.txt");
		enemy = new Enemy("Pneumoultramicroscopico", 275, 0, 0, 0.7f, 0, 0.7f);
		target = new Target();
		target.setTarget(enemy);
		scr = new Score(10);
		
	}


	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		bg.drawImage(bg.getPosx(), bg.getPosy());
		player.drawPlayer();
		g.drawString(enemy.getString(), enemy.getPosx(), enemy.getPosy());
		g.drawString(scr.getScore(), 520, 10);
		
		/*for(Enemy e : enemies)
		{
			g.drawString(e.getString(), e.getPosx(), e.getPosy());
		}*/
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		keyPressed.setInput(gc.getInput());		
		bg.moveY();
				
		/*for(Enemy e : enemies)
		{
			e.move();
		}*/
		key = keyPressed.getCharKey();
		enemy.move();
		
		/*Verifica se uma tecla alfabética foi pressionada
		 * Caso verdadeiro retorna true 
		 * E verifica se o alvo foi acertado
		 */
		if(key.equals("vazio") == false)
		{
			if(target.hit(key))
			{
				scr.successfulTarget();
			}
			else
			{
				scr.resetCombo();
			}
		}
	
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}
}
