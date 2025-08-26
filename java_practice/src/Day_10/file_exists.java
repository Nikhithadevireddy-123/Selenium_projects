package Day_10;

import java.io.File;
import java.io.IOException;

public class file_exists {
	public static void main(String[] args) throws IOException {

			File file=new File("simple1.txt");
			if(file.exists())
			{
				System.out.println("file exists" );
			}
			else
			{
				System.out.println("file does not exists");
			}
		}

}
