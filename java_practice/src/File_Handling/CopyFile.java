package File_Handling;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException { 
    	//create new file
     PrintWriter w=new PrintWriter(new PrintWriter("simple.txt"));
        w.write("Hi this is nikhitha");
        System.out.println("File created");
        //copy file
         Path copypath=Paths.get("student.txt");
         Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING); 
         System.out.println("File copied");
         w.close();
}
}
