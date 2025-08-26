package File_Handling;
import java.io.*;
class Studenta implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double marks;
    public Studenta(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}
public class DeserializeStudent {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("student.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Studenta student = (Studenta) ois.readObject();
            System.out.println("Deserialized Student object:");
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

