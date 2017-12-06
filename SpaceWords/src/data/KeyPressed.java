package data;


import org.newdawn.slick.Input;

public class KeyPressed {	
	/*Esse método retorna o char correspondente a tecla pressionada*/
	static Input input;
	
	@SuppressWarnings("static-access")
	public static String getCharKey()
	{
		if(input.isKeyPressed(Input.KEY_A))
		{
			return "a";
		}
		else if(input.isKeyPressed(input.KEY_B))
		{
			return "b";
		}
		else if(input.isKeyPressed(input.KEY_C))
		{
			return "c";
		}
		else if(input.isKeyPressed(input.KEY_D))
		{
			return "d";
		}
		else if(input.isKeyPressed(input.KEY_E))
		{
			return "e";
		}
		else if(input.isKeyPressed(input.KEY_F))
		{
			return "f";
		}
		else if(input.isKeyPressed(input.KEY_G))
		{
			return "g";
		}
		else if(input.isKeyPressed(input.KEY_H))
		{
			return "h";
		}
		else if(input.isKeyPressed(input.KEY_I))
		{
			return "i";
		}
		else if(input.isKeyPressed(input.KEY_J))
		{
			return "j";
		}
		else if(input.isKeyPressed(input.KEY_K))
		{
			return "k";
		}
		else if(input.isKeyPressed(input.KEY_L))
		{
			return "l";
		}
		else if(input.isKeyPressed(input.KEY_M))
		{
			return "m";
		}
		else if(input.isKeyPressed(input.KEY_N))
		{
			return "n";
		}
		else if(input.isKeyPressed(input.KEY_O))
		{
			return "o";
		}
		else if(input.isKeyPressed(input.KEY_P))
		{
			return "p";
		}
		else if(input.isKeyPressed(input.KEY_Q))
		{
			return "q";
		}
		else if(input.isKeyPressed(input.KEY_R))
		{
			return "r";
		}
		else if(input.isKeyPressed(input.KEY_S))
		{
			return "s";
		}
		else if(input.isKeyPressed(input.KEY_T))
		{
			return "t";
		}
		else if(input.isKeyPressed(input.KEY_U))
		{
			return "u";
		}
		else if(input.isKeyPressed(input.KEY_V))
		{
			return "v";
		}
		else if(input.isKeyPressed(input.KEY_W))
		{
			return "w";
		}
		
		else if(input.isKeyPressed(input.KEY_X))
		{
			return "x";
		}
		else if(input.isKeyPressed(input.KEY_Y))
		{
			return "y";
		}
		
		else if(input.isKeyPressed(input.KEY_Z))
		{
			return "z";
		}
		return "vazio";/*Nenhuma tecla pressionada*/
	}
	
	public static void setInput(Input in)
	{
		input = in;
	}

}
