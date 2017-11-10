package Hanoi;

public class MainClass
{
	public static void main(String[] args)
	{
		int n = 3; 
		hanoi(n, 'A', 'B', 'C');
	}
	
	public static void hanoi(int disk, char source, char dest, char aux)
	{
		if(disk > 0)	
		{
			hanoi(disk-1, source, aux, dest);
			System.out.println("Move to: " + source + " -> " + dest);
			System.out.println("Discos: " + disk);
			hanoi(disk-1, aux, dest, source);
		}
	}
}
