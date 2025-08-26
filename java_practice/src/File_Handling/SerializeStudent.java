package File_Handling;

import java.io.*;

class Studentt implements Serializable {
    private static final long serialVersionUID = 1L; 

    int id;
    String name;
    double marks;

    public Studentt(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

public class SerializeStudent {
    public static void main(String[] args) {
        Studentt student = new Studentt(101, "Nikhitha", 65.5);

        try (FileOutputStream fos = new FileOutputStream("student.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(student);
            System.out.println("Student object serialized to student.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

