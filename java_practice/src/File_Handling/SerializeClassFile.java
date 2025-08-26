package File_Handling;
import java.io.*;
import java.nio.file.*;

	public class SerializeClassFile {
	    public static void main(String[] args) throws IOException {
	        // Set the path to the .class file
	        String sourcePath = "C:\\Program Files\\Java\\jdk-24\\bin";
	        String serializedPath = "Student.ser";

	        // Read the .class file into a byte array
	        byte[] classBytes = Files.readAllBytes(Paths.get(sourcePath));

	        // Serialize (write) the bytes to .ser file
	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serializedPath));
	        oos.writeObject(classBytes);
	        oos.close();

	        System.out.println("Class file serialized to " + serializedPath);
	    }
	}
