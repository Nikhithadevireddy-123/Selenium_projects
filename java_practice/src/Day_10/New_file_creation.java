package Day_10;

import java.io.File;

public class New_file_creation {

	public static void main(String[] args) {
		try {
			File file=new File("C:\\File_Handling/simple1.txt");
			if(file.createNewFile())
			{
				System.out.println("file created:"+file.getName());
			}
			else
			{
				System.out.println("file already exists");
			}
					
		}catch(Exception e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}

	}

}
