package Day_10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String searchWord = "sample"; // The word to search for
        int count = 0;

        try {
            File file = new File("myFile.txt"); // Use the same dummy file or an existing one
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Use regex to find whole words, ignoring case
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            scanner.close();
            System.out.println("The word '" + searchWord + "' appeared " + count + " times.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
