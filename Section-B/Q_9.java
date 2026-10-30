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

// Main Class to demonstrate Polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating Employee references for runtime polymorphism
        Employee emp1 = new Developer(101, "Alice Smith", 50000, 8000);
        Employee emp2 = new Manager(102, "Bob Johnson", 70000, 15000, 5000);

        // Polymorphic method calls
        System.out.println("--- Employee Salary Details (Polymorphism) ---");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
