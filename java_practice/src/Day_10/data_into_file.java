package Day_10;

import java.io.FileWriter;
import java.io.IOException;

public class data_into_file {

	public static void main(String[] args) {
		try {
			FileWriter bw=new FileWriter("C:\\File_Handling/sample1.txt");
	        bw.write("hello\n");
	        bw.write("welcome to java learning sessions");
	        bw.close();
	        System.out.println("write file successfully");
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		

	}

}
