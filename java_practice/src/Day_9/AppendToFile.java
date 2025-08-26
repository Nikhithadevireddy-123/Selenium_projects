package Day_9;
import java.io.FileWriter;
import java.io.IOException;
public class AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true); // true = append mode
            writer.write("manasa");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

