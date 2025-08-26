package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.*;
 
// 1. Student class (Java Bean)
class Student {
    int id;
    String name;
    int marks;
 
    Student(int rollno, String name, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
 
public class Preparedstatement_prac {
    public static void main(String[] args) {
        // 2. Database credentials
        String url = "jdbc:mysql://localhost:3306/mydb"; // Replace with your DB name
        String user = "root"; // Replace with your DB user
        String password = "Nikhitha123"; // Replace with your DB password
 
        // 3. List of students to insert
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Neeva Sharma", 80));
        students.add(new Student(102, "Reeva Sharma", 70));
        students.add(new Student(103, "Shiva Upadhyay", 50));
        students.add(new Student(104, "Amit Verma", 72));
        students.add(new Student(105, "Sonal Mehta", 89));
 
        // 4. JDBC code
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            // Insert records
            String insertQuery = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";
            PreparedStatement insertPst = con.prepareStatement(insertQuery);
 
            for (Student s : students) {
                insertPst.setInt(1, s.id);
                insertPst.setString(2, s.name);
                insertPst.setInt(3, s.marks);
                //create table students(rollno int ,name varchar(20), age int);              insertPst.addBatch(); // Adds this set of data to the batch
            }
 
            int[] result = insertPst.executeBatch(); // Executes all insertions
            System.out.println(result.length + " records inserted successfully.\n");
 
            // Fetch and print all records
            String selectQuery = "SELECT * FROM students";
            PreparedStatement selectPst = con.prepareStatement(selectQuery);
            ResultSet rs = selectPst.executeQuery();
 
            System.out.println("ID\tName\t\t\tMarks");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
 
                System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

