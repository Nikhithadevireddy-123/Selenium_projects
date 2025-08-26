package Day_10;

import java.io.FileWriter;
import java.io.IOException;

public class append_text_file {

	public static void main(String[] args) {
		try {
            FileWriter writer = new FileWriter("sample.txt", true); // true = append mode
            writer.write("from batch 8");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
