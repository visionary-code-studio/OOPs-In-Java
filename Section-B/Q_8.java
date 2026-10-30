// Grandparent class
class Person {
    private String name;
    private int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Parent class inheriting from Person
class Employee extends Person {
    private int employeeId;
    private double salary;

    // Constructor for Employee
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age); // Calling the grandparent constructor
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        displayPersonDetails(); // Display inherited person details
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

// Child class inheriting from Employee (Multilevel Inheritance)
class Manager extends Employee {
    private String department;
    private int teamSize;

    // Constructor for Manager
    public Manager(String name, int age, int employeeId, double salary, String department, int teamSize) {
        super(name, age, employeeId, salary); // Calling the parent constructor
        this.department = department;
        this.teamSize = teamSize;
    }

    // Method to display complete Manager details
    public void displayManagerDetails() {
        System.out.println("--- Complete Manager Details ---");
        displayEmployeeDetails(); // Display inherited person and employee details
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the lowest child class (Manager)
        Manager manager = new Manager("Alice Johnson", 42, 1001, 125000.50, "Engineering", 12);

        // Demonstrating multilevel inheritance by pulling fields from all 3 layers
        manager.displayManagerDetails();
    }
}
