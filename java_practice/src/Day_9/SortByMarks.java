package Day_9;

import java.util.*;

class Student2 {  
    String name;
    int marks;

    Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class SortByMarks {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("manasa", 65));
        students.add(new Student2("shruthi", 72));
        students.add(new Student2("shivani", 88));

        System.out.println("Before Sorting:");
        for (Student2 s : students) {
            System.out.println(s);
        }
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println("\nAfter Sorting by marks (desc):");
        for (Student2 s : students) {
            System.out.println(s);
        }
    }
}


