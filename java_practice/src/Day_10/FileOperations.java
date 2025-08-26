package Day_10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileOperations {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("File.txt");
        Path destinationPath = Paths.get("simple1.txt");

        try {
            // Create a file
            Files.createFile(sourcePath);
            System.out.println("File created: " + sourcePath);

            // Move a file
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved from " + sourcePath + " to " + destinationPath);

            // Delete a file
            Files.delete(destinationPath);
            System.out.println("File deleted: " + destinationPath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
