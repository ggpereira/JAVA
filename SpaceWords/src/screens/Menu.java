package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;

import sources.GameFont;
import sources.GameImage;




public class Menu extends BasicGameState{
	Image menu_bg;
	GameFont menu_font;
	int cursorX; 
	int cursorY;
	
	public Menu(int MENU) {
		
	}
	
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		 menu_bg = GameImage.loadImage("resources/img/bg_menu.png");
		 menu_font = new GameFont("resources/fonts/INVASION2000.TTF", 30f);	}


	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		menu_bg.draw();
		if((cursorX >= 222 && cursorX <= 309) && (cursorY >= 454 && cursorY <= 475)) {
			menu_font.getFont().drawString(222, 218, "PLAY");
			if(Mouse.isButtonDown(0)) {
				sbg.enterState(3);
			}
		}
		if((cursorX >= 188 && cursorX <= 339) && (cursorY >= 362 && cursorY <= 385)){
			menu_font.getFont().drawString(188, 308, "RANKING");
		}
		if((cursorX >= 190 && cursorX <= 289) && (cursorY >= 273 && cursorY <= 296)) {
			menu_font.getFont().drawString(191, 398, "CREDITS");
		}
		if((cursorX >= 224 && cursorX <= 305) && (cursorY >= 172 && cursorY <= 195)) {
			menu_font.getFont().drawString(226, 498, "QUIT");
			if(Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
				
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		cursorX = Mouse.getX();
		cursorY = Mouse.getY();
		
	}


	public int getID() {
	
		return 0;
	}
	

}
