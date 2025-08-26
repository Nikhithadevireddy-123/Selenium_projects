package Day_9;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Student s) {
        return Integer.compare(this.id, s.id);
    }
    public String toString() {
        return id + " = " + name;
    }
}
public class SortStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "abhi"));
        students.add(new Student(3, "nikki"));
        students.add(new Student(1, "nitish"));

        System.out.println("Before Sorting:");
        for (Student st : students) {
            System.out.println(st);
        }
        Collections.sort(students); 

        System.out.println("\nAfter Sorting:");
        for (Student st : students) {
            System.out.println(st);
        }
    }
}

