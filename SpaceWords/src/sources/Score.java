package sources;

import org.newdawn.slick.Color;

public class Score {
	private Integer points;
	private GameFont text;
	private int combo;
	
	public Score() {
		points = 0;
		text = new GameFont();
		combo = 1;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void resetCombo() {
		combo = 0;
	}
	
	public void increasesCombo() {
		combo += 1;
	}
	
	public void successfulTarget() {
		points += (4 * combo);
	}
	
	public void draw() {
		text.getFont().drawString(25, 25, String.format("%1$05d",points), Color.orange);
	}
	
	
	
}
