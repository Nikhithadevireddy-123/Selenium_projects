package Day_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_data_file {

	public static void main(String[] args) {
		try {
		BufferedReader bf=new BufferedReader(new FileReader("C:\\File_Handling/sample1.txt"));
		String line;
		while((line = bf.readLine()) != null)
		{
			System.out.println(line);
		}
		bf.close();	
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
		
	}
}
