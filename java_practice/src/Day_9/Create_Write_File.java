package Day_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Create_Write_File {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\\\File_Handling/student.txt");
		fw.write("nikki\n");
		fw.write("abhi\n");
		fw.write("chinni\n");
		fw.write("chintu\n");
		fw.write("nitish\n");
		fw.close();
		System.out.println("successfully written to file");
	}
}
