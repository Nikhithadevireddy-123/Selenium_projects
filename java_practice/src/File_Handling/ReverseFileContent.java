package File_Handling;

import java.io.*;
import java.util.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reversed.txt"))) {
            for (int i = lines.size() - 1; i >= 0; i--) {
                bw.write(lines.get(i));
                bw.newLine();
            }
            System.out.println("Reversed file created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}

