package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile_demo1 {

	public static void main(String[] args) throws IOException
	{
		List<String> lines=new ArrayList<String>();
		BufferedReader r=new BufferedReader(new FileReader("sample.txt"));
		String line;
		while((line=r.readLine())!=null)
		{
			lines.add(line);
			
		}
		for(String l:lines)
		{
			System.out.println(l);
		}
		r.close();
		

	}

}
