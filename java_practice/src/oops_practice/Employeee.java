package oops_practice;

public class Employeee {
    // this keyword variable: instance variables of the Employee object
    private String name;
    private int employeeId;
    private double salary;

    // this keyword constructor: uses 'this' to refer to instance variables
    public Employeee(String name, int employeeId, double salary) {
        this.name = name; // 'this.name' refers to the instance variable 'name'
        this.employeeId = employeeId; // 'this.employeeId' refers to the instance variable 'employeeId'
        this.salary = salary; // 'this.salary' refers to the instance variable 'salary'
    }

    // this keyword method: uses 'this' to call another method within the same object
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Salary:" + this.salary);
        
    }
    public static void main(String[] args) {
        // this keyword object: creating an Employee object
        Employeee emp1 = new Employeee("Alice Smith", 101, 60000.00);

        // this keyword method: invoking a method on the emp1 object
        emp1.displayEmployeeDetails();

        System.out.println("\n--- Another Employee ---");
        Employeee emp2 = new Employeee("Bob Johnson", 102, 75000.00);
        emp2.displayEmployeeDetails();
    }
}
