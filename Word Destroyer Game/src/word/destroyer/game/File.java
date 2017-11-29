package word.destroyer.game;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Collection;
import java.util.ArrayList;

public class File {
	
	static Collection<String> tokenizer(String path) 
	{
		Collection<String> words = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(path);
			StreamTokenizer st = new StreamTokenizer(fileReader);
		
			/*Enquanto o final do arquivo não for encontrado*/
			while(st.nextToken() != StreamTokenizer.TT_EOF)
			{
				if(st.ttype == StreamTokenizer.TT_WORD)	/*Se o token atual for uma palavra, então insere no arrayList de Strings*/
				{
				words.add(st.sval);
				}
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		return words;
	}
}
