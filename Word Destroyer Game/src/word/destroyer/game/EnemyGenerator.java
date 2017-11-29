package word.destroyer.game;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public class EnemyGenerator{
	
	float min = 0;
	float max = 550;
	
	static Random rand = new Random();
	
	public static Collection<Enemy> generateEnemy(String path)
	{
		Collection<String> words = File.tokenizer(path);
		Collection<Enemy> enemies = new ArrayList<Enemy>();
		int i = - 10; /*Variável temporária para a finalidade de testes*/
		
		for(String temp : words)
		{
			Enemy enemy = new Enemy(temp.toString(), getPosx(), getPosy() + i, 0, getVely(), 0, 0.7f);
			enemies.add(enemy);
			i--;
		}
		
		return enemies;
	}
	
	public static float getPosx()
	{
		return rand.nextFloat()*550;
	}
	
	public static float getPosy()
	{
		return 0;
	}
	
	public static float getVely()
	{
		return rand.nextFloat() + 0.1f; 
	}
	
}
