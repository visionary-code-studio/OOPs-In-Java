import java.util.*;

public class Classroom {
    private String className;
    private String[] students;

    // Parameterized Constructor
    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public void printClassroomDetails() {
        System.out.println("Class Name: " + this.className);
        System.out.println("Students: " + Arrays.toString(this.students));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the Class:");
        String className=sc.nextLine();
        System.out.print("Enter number of Students in the Class: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] studentList = new String[n];
        System.out.println("Enter " + n + " Names of the Students:");
        for (int i = 0; i < n; i++) {
            studentList[i] = sc.nextLine();
        }

        // Invoking the constructor with 'new'
        Classroom myClassroom = new Classroom(className, studentList);
        myClassroom.printClassroomDetails();

        sc.close();
    }
}
