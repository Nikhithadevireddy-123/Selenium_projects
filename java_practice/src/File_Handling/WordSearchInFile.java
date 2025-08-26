package File_Handling;

import java.io.*;
import java.util.Scanner;

public class WordSearchInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        File file = new File("student2.txt");

        if (!file.exists()) {
            System.out.println("File notes.txt does not exist.");
            sc.close();
            return;
        }

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains(word)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }

        if (found) {
            System.out.println("The word \"" + word + "\" exists in the file.");
        } else {
            System.out.println("The word \"" + word + "\" was NOT found in the file.");
        }

        sc.close();
    }
}

