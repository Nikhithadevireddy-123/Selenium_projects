package Day_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_content_file {
	public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\File_Handling/sample1.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("C:\\File_Handling/simple1.txt");

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
