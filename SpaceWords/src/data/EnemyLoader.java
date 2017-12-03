package data;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import sources.Enemy;

public class EnemyLoader {
	Collection<String> file1 = new ArrayList<String>();
	Collection<String> file2 = new ArrayList<String>();
	Collection<Enemy> enemies = new ArrayList<Enemy>();
	Collection<Enemy> enemies2 = new ArrayList<Enemy>();
	
	public EnemyLoader() {
		tokenizeFile1();
		tokenizeFile2();
		GenerateEnemies();
	}
	
	@SuppressWarnings("unused")
	private void tokenizeFile1() {
		try {
			FileReader fileReader = new FileReader("resources/text/enemies.txt");
			
			StreamTokenizer st = new StreamTokenizer(fileReader);
			while(st.nextToken() != StreamTokenizer.TT_EOF) {
				if(st.ttype == StreamTokenizer.TT_WORD) {
					file1.add(st.sval);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private void tokenizeFile2() {
		try {
			FileReader fileReader = new FileReader("resources/text/enemies2.txt");
			
			StreamTokenizer st = new StreamTokenizer(fileReader);
			while(st.nextToken() != StreamTokenizer.TT_EOF) {
				if(st.ttype == StreamTokenizer.TT_WORD) {
					file2.add(st.sval);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void GenerateEnemies() {
		Random rand = new Random();
		for(String temp : file1) {
			float x = rand.nextFloat()*550;
			float y = 0;
			float speedx = rand.nextFloat() + 0.1f;
			float speedy = rand.nextFloat() + 0.1f;
			Enemy e = new Enemy(x, y,  speedx, speedy, temp.toString());
			enemies.add(e);
		}
		
		
		for(String temp : file2) {
			float x = rand.nextFloat()*550;
			float y = 0;
			float speedx = rand.nextFloat() + 0.1f;
			float speedy = rand.nextFloat() + 0.1f;
			Enemy e2 = new Enemy(x, y,  speedx, speedy, temp.toString());
			enemies2.add(e2);
		}
	}
	
	public Collection<Enemy> selectLoad(int n) {
		switch(n) {
			case 0:
				return enemies;
			case 1:
				return enemies2;
		}
		
		return null;
	}
	
}
