package Day_9;

import java.util.*;

class Studentl implements Comparable<Studentl> {
    String name;
    int marks;

    Studentl(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Sort by name (Comparable)
    public int compareTo(Studentl other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class SortStudentExample {
    public static void main(String[] args) {
        List<Studentl> students = new ArrayList<>();
        students.add(new Studentl("shruthi", 65));
        students.add(new Studentl("nikki", 92));
        students.add(new Studentl("abhi", 78));

        // Sort by name using Comparable
        Collections.sort(students);
        System.out.println("Sorted by Name:");
        for (Studentl s : students) {
            System.out.println(s);
        }

        // Sort by marks using Comparator
        Collections.sort(students, new Comparator<Studentl>() {
            public int compare(Studentl s1, Studentl s2) {
                return Integer.compare(s1.marks, s2.marks);
            }
        });

        System.out.println("\nSorted by Marks:");
        for (Studentl s : students) {
            System.out.println(s);
        }
    }
}
