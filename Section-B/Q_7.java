import java.util.Arrays;

// Define the Classroom class
public class Classroom {
    // Instance variables
    private String className;
    private String[] students;

    // Parameterized constructor that initializes className and students
    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    // Method to print the values of all variables
    public void printClassroomDetails() {
        System.out.println("Class Name: " + this.className);
        // Using Arrays.toString() to cleanly print the elements of the string array
        System.out.println("Students: " + Arrays.toString(this.students));
    }

    // Main method to test the class implementation
    public static void main(String[] args) {
        // Create an array of student names
        String[] studentList = {"Alex", "Blake", "Charlie"};

        // Instantiate the Classroom object using the parameterized constructor
        Classroom myClassroom = new Classroom("Computer Science 101", studentList);

        // Print the values of the instance variables
        myClassroom.printClassroomDetails();
    }
}
