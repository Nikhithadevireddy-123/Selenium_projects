package Day_10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import File_Handling.Employee;

public class DeserializeEmployee {
    public static void main(String[] args) {
        Employee emp = null;
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            emp = (Employee) in.readObject();
            System.out.println("Employee object deserialized:");
            System.out.println(emp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
