package File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileWriteAppend {
    public static void main(String[] args) throws IOException {
        String fileName = "myFile.txt";
        String data = "This is new data to append.\n"; 
            Path filePath = Paths.get(fileName);

            Files.write(filePath, data.getBytes(), StandardOpenOption.APPEND);

            System.out.println("Data successfully written to " + fileName);

        } 
        
    }

