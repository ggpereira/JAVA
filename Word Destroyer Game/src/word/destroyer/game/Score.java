package word.destroyer.game;

public class Score {
	private Integer points;
	private Integer score = 0;
	private Integer combo = 1;
	private Integer numSucessful = 0;
	
	public Score(int n) /*Recebe o valor da pontuação a ser somada em cada acerto*/
	{
		points = n; 
	}
	
	public void successfulTarget()
	{
		score += (points * combo);
		numSucessful++;
		combo();
		System.out.println("Score: " + score + " combo: " + combo);
	}
	
	public void combo()
	{
		if(numSucessful > 3)
		{
			combo++;
		}
	}
	
	public void resetCombo()
	{
		combo = 1;
		numSucessful = 0;
	}
	
	public String getScore()
	{
		return score.toString();
	}
}
