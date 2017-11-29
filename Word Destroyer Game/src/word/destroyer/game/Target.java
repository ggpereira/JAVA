package word.destroyer.game;


public class Target {
	
	private Enemy target;
	private StringBuilder buffer;
	
	public void setTarget(Enemy enemy)
	{
		target = enemy;
		buffer = new StringBuilder(enemy.getString());
	}
	
	public boolean hit(String key)
	{
		if(destroyed() == false)
		{
			System.out.println("Chave de entrada: " + key);
			if(buffer.substring(0, 1).equalsIgnoreCase(key))
			{
				System.out.println("Acertou!!");
				buffer.deleteCharAt(0);
				target.setString(buffer.toString());
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean destroyed()
	{
		if(buffer.length() > 0)
		{
			return false;
		}
		
		System.out.println("Palavra destruida!");
		return true;
	}
	
	
	
	public Enemy getTarget()
	{
		return target;
	}
	
}
