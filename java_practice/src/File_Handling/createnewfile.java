package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class createnewfile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\File_Handling/newfile.txt");
		try {
			f.createNewFile(); //creating new file on particular location
			System.out.println(f.setWritable(true));
		}
		catch(Exception e)
		{
			System.out.println("file not found");
			System.out.println(e);
		}
		
		//file details
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
		
		//writing data to file
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("C:\\\\File_Handling/newfile.txt"));
			w.write("hello");
			w.write("java");
			w.write("    ");
			w.write("hi");
			System.out.println("write file successfully");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//using printerwriter
		try {
            PrintWriter w1=new PrintWriter(new FileWriter("C:\\\\\\\\File_Handling/newfile.txt"));
            w1.println("hello");
            w1.println("welcome to java selenium class");
            w1.close();
            System.out.println("write file successfully"); 
          }
        catch (IOException e) {
              e.printStackTrace();
        }
     
     //using bufferedreader
     BufferedReader r=new BufferedReader(new FileReader("C:\\\\File_Handling/newfile.txt"));
     List<String> lines=new ArrayList<String>();
     
		String line;
		while((line=r.readLine())!=null)
		{
			lines.add(line);
			
		}
		for(String l:lines)
		{
			System.out.println(l);
		}
		r.close();
      }

	}


