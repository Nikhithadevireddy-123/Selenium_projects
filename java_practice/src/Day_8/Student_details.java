package Day_8;
//Store Custom Objects 
import java.util.ArrayList;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Student_details {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nikhitha", 85));
        students.add(new Student(2, "chinni", 90));
        students.add(new Student(3, "manasa", 78));

        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }
    }
}

