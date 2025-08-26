package jdbc;

import java.sql.*;

public class StudentMiniProject {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Replace with your DB name
        String user = "root"; // Replace with your DB username
        String password = "Nikhitha123"; // Replace with your DB password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            System.out.println("Connection created");

            // Create table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student(" +
                    "rollno INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "per FLOAT, " +
                    "email VARCHAR(100), " +
                    "city VARCHAR(30))");

            //  Insert records (clear if exists first)
            stmt.executeUpdate("DELETE FROM student");
            stmt.executeUpdate("INSERT INTO student VALUES" +
                    "(101, 'chinni', 98, 'chinni@gmail.com', 'karnool')," +
                    "(102, 'nikki', 89, 'nikki@gmail.com', 'karnool')," +
                    "(103, 'abhi', 79, 'abhi@gmail.com', 'vijayawada')," +
                    "(104, 'chintu', 99, 'chintu@gmail.com', 'hyderabad')");

            // print table
            System.out.println("\nStudent Table:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " +
                        rs.getFloat("per") + " " + rs.getString("email") + " " + rs.getString("city"));
            }

            //Update
            stmt.executeUpdate("UPDATE student SET per = 88 WHERE name = 'abhi'");

            // Highest percentage student
            System.out.println("\nHighest Percentage Student:");
            rs = stmt.executeQuery("SELECT * FROM student ORDER BY per DESC LIMIT 1");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " -> " + rs.getFloat("per"));
            }

            // Ascending order
            System.out.println("\nStudents in Ascending Order by Name:");
            rs = stmt.executeQuery("SELECT * FROM student ORDER BY name ASC");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // 7. Students from 'karnool'
            System.out.println("\nStudents from 'karnool':");
            rs = stmt.executeQuery("SELECT * FROM student WHERE city = 'karnool'");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // adding column
            stmt.executeUpdate("ALTER TABLE student ADD COLUMN phone VARCHAR(15)");
            System.out.println("\nAfter Adding 'phone' Column:");
            rs = stmt.executeQuery("DESCRIBE student");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " - " + rs.getString(2));
            }

            // modifying datatype
            stmt.executeUpdate("ALTER TABLE student MODIFY per DOUBLE");
            System.out.println("\nAfter Modifying 'per' to DOUBLE:");
            rs = stmt.executeQuery("DESCRIBE student");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " - " + rs.getString(2));
            }

            // rename table name 
            stmt.executeUpdate("RENAME TABLE student TO student_info");
            System.out.println("\nAfter Renaming Table to 'student_info':");
            rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // drop column 
            stmt.executeUpdate("ALTER TABLE student_info DROP COLUMN phone");
            System.out.println("\nAfter Dropping 'phone' Column:");
            rs = stmt.executeQuery("DESCRIBE student_info");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " - " + rs.getString(2));
            }

            // deleting a row
            stmt.executeUpdate("DELETE FROM student_info WHERE rollno = 102");
            System.out.println("\nAfter Deleting Row with rollno = 102:");
            rs = stmt.executeQuery("SELECT * FROM student_info");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " +
                        rs.getDouble("per") + " " + rs.getString("email") + " " + rs.getString("city"));
            }

            // deleting  all records from table
            stmt.executeUpdate("DELETE FROM student_info");
            System.out.println("\nAfter Deleting All Rows:");
            rs = stmt.executeQuery("SELECT * FROM student_info");
            if (!rs.next()) {
                System.out.println("No records found.");
            }

            // drop table
            stmt.executeUpdate("DROP TABLE student_info");
            System.out.println("\nAfter Dropping 'student_info' Table:");
            rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // JOINS 
            stmt.executeUpdate("DROP TABLE IF EXISTS student1, institute");
            stmt.executeUpdate("CREATE TABLE student1 (rollno INT, name VARCHAR(50))");
            stmt.executeUpdate("CREATE TABLE institute (rollno INT, institute_name VARCHAR(50))");

            stmt.executeUpdate("INSERT INTO student1 VALUES (1, 'Nikki'), (2, 'Abhi'), (3, 'Chintu')");
            stmt.executeUpdate("INSERT INTO institute VALUES (2, 'IIT'), (3, 'NIT'), (4, 'BITS')");

            // INNER JOIN
            System.out.println("\nINNER JOIN:");
            rs = stmt.executeQuery("SELECT * FROM student1 s INNER JOIN institute i ON s.rollno = i.rollno");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("institute_name"));
            }

            // LEFT JOIN
            System.out.println("\nLEFT JOIN:");
            rs = stmt.executeQuery("SELECT * FROM student1 s LEFT JOIN institute i ON s.rollno = i.rollno");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("institute_name"));
            }

            // RIGHT JOIN
            System.out.println("\nRIGHT JOIN:");
            rs = stmt.executeQuery("SELECT * FROM student1 s RIGHT JOIN institute i ON s.rollno = i.rollno");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("institute_name"));
            }

            // FULL JOIN (via UNION)
            System.out.println("\nFULL JOIN:");
            rs = stmt.executeQuery(
                    "(SELECT * FROM student1 s LEFT JOIN institute i ON s.rollno = i.rollno) " +
                    "UNION " +
                    "(SELECT * FROM student1 s RIGHT JOIN institute i ON s.rollno = i.rollno)");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("institute_name"));
            }

            con.close();
           

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

