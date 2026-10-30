import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of terms
        System.out.print("Enter the number of terms to display: ");
        int terms = scanner.nextInt();

        // Edge case: Handle invalid or zero terms
        if (terms <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Fibonacci Series up to " + terms + " terms:");
            generateFibonacci(terms);
        }

        scanner.close();
    }

    /**
     * Iteratively prints the Fibonacci sequence up to n terms.
     */
    public static void generateFibonacci(int n) {
        long firstTerm = 0;
        long secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + (i < n ? ", " : "\n"));

            // Calculate the next term
            long nextTerm = firstTerm + secondTerm;
            
            // Shift the values forward
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
