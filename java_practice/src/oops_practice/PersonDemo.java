package oops_practice;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract String getRoleInfo();

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println(getRoleInfo());
        System.out.println();
    }
}
class Student extends Person {
    String course;
    int rollNumber;

    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }
    String getRoleInfo() {
        return "Role: Student, Course: " + course + ", Roll Number: " + rollNumber;
    }
}

class Professor extends Person {
    String subject;
    double salary;

    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    String getRoleInfo() {
        return "Role: Professor, Subject: " + subject + ", Salary: $" + salary;
    }
}

class TeachingAssistant extends Student {
    String supervisor;

    TeachingAssistant(String name, int age, String course, int rollNumber, String supervisor) {
        super(name, age, course, rollNumber);
        this.supervisor = supervisor;
    }

    String getRoleInfo() {
        return "Role: Teaching Assistant, Course: " + course + ", Roll Number: " + rollNumber +
                ", Supervisor: " + supervisor;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person student = new Student("Nikki", 20, "Computer Science", 101);
        Person professor = new Professor("Dr. Manasa", 45, "Electronics and Communication Engineering", 75000);
        Person ta = new TeachingAssistant("Shruthi", 23, "Mechanical", 102, "Dr. Manasa");

        student.printInfo();
        professor.printInfo();
        ta.printInfo();
    }
}

