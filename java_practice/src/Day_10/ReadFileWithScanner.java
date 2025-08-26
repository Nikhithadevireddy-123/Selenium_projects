package Day_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt"); // Create a dummy file or use an existing one
            // Example: Create a dummy file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
                // Write some content to the dummy file for demonstration
                try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
                    writer.write("This is a sample file.\n");
                    writer.write("It contains multiple words and lines.");
                }
            }

            Scanner scanner = new Scanner(file);
            System.out.println("Tokens in the file:");
            while (scanner.hasNext()) {
                System.out.println(scanner.next()); // Reads and prints the next token
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
