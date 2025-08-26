package File_Handling;

import java.io.File;

public class CreateNew_file {

	public static void main(String[] args) {
		File f=new File("C:\\File_Handling/sample.txt");
		try {
			f.createNewFile(); //creating new file on particular location
			System.out.println(f.setWritable(true));
		}
		catch(Exception e)
		{
			System.out.println("file not found");
			System.out.println(e);
		}

	}

}
