package File_Handling;
import java.io.File;

public class FileCheck {
    public static void main(String[] args) {
        File file = new File("student.txt");

        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Name: " + file.getName());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size (bytes): " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}

