package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Write_File1 {

	public static void main(String[] args) {
		try {
		FileWriter bw=new FileWriter("sample.txt");
        bw.write("hello/n");
        bw.write("welcome to java learning sessions");
        bw.close();
        System.out.println("write file successfully");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
        
	}

}
