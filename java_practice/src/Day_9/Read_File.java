package Day_9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {

	public static void main(String[] args) throws IOException {
		try {
		BufferedReader r=new BufferedReader(new FileReader("student.txt"));
		String line;
		while((line=r.readLine())!=null)
		{
			System.out.println(line);
			
		}
		r.close();
		}catch(IOException e)
		{
			e.printStackTrace();	
		}
	}

}
