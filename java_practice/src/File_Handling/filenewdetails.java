package File_Handling;

import java.io.File;

public class filenewdetails {

		public static void main(String[] args) {
			File f=new File("newfile.txt");
			if(f.exists())
			{
				System.out.println("file name:"+f.getName());
				System.out.println("file location:"+f.getAbsolutePath());
				System.out.println("file size:"+f.length());
				System.out.println("file readable:"+f.canRead());
				System.out.println("file writable:"+f.canWrite());
			}
			else
			{
				System.out.println("file not found");
			}

		}

}
