package Day_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Countlineswords_file {
	public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample1.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+"); // split by space
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
