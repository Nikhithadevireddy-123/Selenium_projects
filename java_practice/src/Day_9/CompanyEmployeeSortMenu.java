package Day_9;

import java.util.*;

class CompanyEmployee {
    String name;
    double salary;
    String department;

    CompanyEmployee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String toString() {
        return name + " = " + salary + " = " + department;
    }
}

public class CompanyEmployeeSortMenu {
    public static void main(String[] args) {
        List<CompanyEmployee> companyEmployees = new ArrayList<>();
        companyEmployees.add(new CompanyEmployee("Nikhitha", 50000, "HR"));
        companyEmployees.add(new CompanyEmployee("Abhi", 70000, "IT"));
        companyEmployees.add(new CompanyEmployee("Manasa", 60000, "Testor"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Sort Menu ---");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Salary");
            System.out.println("3. Sort by Department");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    companyEmployees.sort(Comparator.comparing(emp -> emp.name));
                    System.out.println("Sorted by Name:");
                    companyEmployees.forEach(System.out::println);
                    break;
                case 2:
                    companyEmployees.sort(Comparator.comparingDouble(emp -> emp.salary));
                    System.out.println("Sorted by Salary:");
                    companyEmployees.forEach(System.out::println);
                    break;
                case 3:
                    companyEmployees.sort(Comparator.comparing(emp -> emp.department));
                    System.out.println("Sorted by Department:");
                    companyEmployees.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}


