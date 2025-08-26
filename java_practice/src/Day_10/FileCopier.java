package Day_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopier {
    public static void main(String[] args) {
        Path source = Paths.get("simple.txt"); // Replace with your source file
        Path destination = Paths.get("student2.txt"); // Replace with your destination file
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
