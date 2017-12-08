package data;

import java.util.List;

import sources.Enemies;
import sources.Enemy;
import sources.Player;
import sources.Target;

public class GameManager {
	private Target target;
	private Enemies enemies;
	private Player player;
	
	/*Default constructor*/
	public GameManager() {
		
	}
	
	public GameManager(Target target, Enemies enemies, Player player) {
		this.target = target; 
		this.enemies = enemies; 
		this.player = player;
	}
	
	/*TARGET CONTROLLER*/
	public void setTarget(Target target) {
		this.target = target;
	}
	
	public boolean targetWait() {
		if(target == null) {
			return true;
		}
		else if(target.isEmpty()) {
			System.out.println("Destruído");
			arrayEnemyRemoveIndex();
			return true;
		}
		else {
			return false;
		}
	}
	
	private void arrayEnemyRemoveIndex() {
		enemies.getEnemies().remove(target.getTarget());
	}
	/* ------------------------------------*/
}
