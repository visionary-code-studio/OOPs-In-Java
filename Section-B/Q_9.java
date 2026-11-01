import java.util.Scanner;

// Superclass
class Employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate salary (to be overridden)
    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Final Salary: $" + calculateSalary());
    }
}

// Subclass Developer
class Developer extends Employee {
    private double codingAllowances;

    public Developer(int employeeId, String name, double basicSalary, double codingAllowances) {
        super(employeeId, name, basicSalary);
        this.codingAllowances = codingAllowances;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + codingAllowances;
    }
}

// Subclass Manager
class Manager extends Employee {
    private double managerialBonus;
    private double travelAllowance;

    public Manager(int employeeId, String name, double basicSalary, double managerialBonus, double travelAllowance) {
        super(employeeId, name, basicSalary);
        this.managerialBonus = managerialBonus;
        this.travelAllowance = travelAllowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + managerialBonus + travelAllowance;
    }
}

// Main Class to demonstrate Polymorphism with User Input
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[2];

        // Input for Developer
        System.out.println("--- Enter Developer Details ---");
        System.out.print("Enter Employee ID: ");
        int devId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String devName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double devBasic = scanner.nextDouble();
        System.out.print("Enter Coding Allowance: ");
        double devAllowances = scanner.nextDouble();

        employees[0] = new Developer(devId, devName, devBasic, devAllowances);

        // Input for Manager
        System.out.println("\n--- Enter Manager Details ---");
        System.out.print("Enter Employee ID: ");
        int mgrId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double mgrBasic = scanner.nextDouble();
        System.out.print("Enter Managerial Bonus: ");
        double mgrBonus = scanner.nextDouble();
        System.out.print("Enter Travel Allowance: ");
        double mgrTravel = scanner.nextDouble();

        employees[1] = new Manager(mgrId, mgrName, mgrBasic, mgrBonus, mgrTravel);

        // Polymorphic method calls
        System.out.println("\n--- Employee Salary Details (Polymorphism) ---");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
}
