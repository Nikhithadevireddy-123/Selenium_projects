package Day_9;

import java.io.*;

public class CountWordsLines {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+"); 
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
