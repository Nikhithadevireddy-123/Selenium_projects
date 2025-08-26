package File_Handling;

import java.io.*;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        File inputFile = new File("student2.txt");
        File outputFile = new File("student.txt");

        if (!inputFile.exists()) {
            System.out.println("File story.txt does not exist.");
            return;
        }

        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
            return;
        }

        String updatedContent = content.toString().replace("Java", "Selenium");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(updatedContent);
            System.out.println("Updated content written to student.txt");
        } catch (IOException e) {
            System.out.println("Error writing to the file.");
            e.printStackTrace();
        }
    }
}

