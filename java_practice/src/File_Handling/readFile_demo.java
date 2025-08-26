package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile_demo {

	public static void main(String[] args) throws IOException
	{
		BufferedReader r=new BufferedReader(new FileReader("sample.txt"));
		String line;
		if((line=r.readLine())!=null)
		{
			System.out.println(line);
			
		}
		else
		{
			System.out.println("file is null");
		}
		r.close();
		

	}

}
