package Day_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSizeChecker {
    public static void main(String[] args) {
        Path filePath = Paths.get("sample1.txt"); // Replace with your file path
        try {
            long sizeInBytes = Files.size(filePath);
            System.out.println("Size of the file: " + sizeInBytes + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
