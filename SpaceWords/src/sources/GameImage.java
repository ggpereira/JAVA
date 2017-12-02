package sources;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class GameImage {
	private static Image img;
	
	public GameImage() {
		
	}
	
	public static Image loadImage(String path) {
		img = null;
		try {
			img = new Image(path);
		}catch(SlickException e) {
			e.printStackTrace();
		}
		return img;
	}
	
}
