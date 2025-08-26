package Day_9;

import java.time.LocalDate;
import java.util.*;

class Employee {
    String name;
    LocalDate joiningDate;

    Employee(String name, LocalDate joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public String toString() {
        return name + " = " + joiningDate;
    }
}

public class SortByJoiningDate {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("manasa", LocalDate.of(2024, 2, 10)));
        employees.add(new Employee("vaishu", LocalDate.of(2023, 3, 23)));
        employees.add(new Employee("sath", LocalDate.of(2020, 8, 15)));
        employees.sort(Comparator.comparing(emp -> emp.joiningDate));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    
}

