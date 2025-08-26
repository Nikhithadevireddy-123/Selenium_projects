package collections_demo;

import java.lang.*;
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) { // Corrected method name
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name; // Improved toString for clarity
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(9, "amit"));
        list.add(new Student(0, "aaryan"));
        list.add(new Student(2, "sholka"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
