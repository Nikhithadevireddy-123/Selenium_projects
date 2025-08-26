package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_file {

	public static void main(String[] args) {
		try {
		BufferedWriter bw=new BufferedWriter(new FileWriter("sample.txt"));
        bw.write("hello");
        bw.newLine();
        bw.write("welcome to java learning sessions");
        bw.close();
        System.out.println("write file successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
        
	}

}
