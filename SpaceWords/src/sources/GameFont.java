package sources;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.ResourceLoader;

public class GameFont {
	private static final String PATH = "resources/fonts/Exo.ttf";
	private static final float SIZE = 24f;
	
	private TrueTypeFont font;
	
	/*Font load
	 * default path
	 */
	public GameFont() {
		loadFont(PATH, SIZE);
	}
	
	/*Select font path and size*/
	public GameFont(String path, float size)
	{
		loadFont(path, size);
	}
	
	public void loadFont(String path, float size) {
		try {
			InputStream inputStream = ResourceLoader.getResourceAsStream(path);
			Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			awtFont = awtFont.deriveFont(size);
			font = new TrueTypeFont(awtFont, true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public TrueTypeFont getFont()
	{
		return font;
	}
	
}
	
	
