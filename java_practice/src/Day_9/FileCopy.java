package Day_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("sample.txt");
            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }
            br.close();
            fw.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
