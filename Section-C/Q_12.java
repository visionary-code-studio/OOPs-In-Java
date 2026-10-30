import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
        
        scanner.close();
    }

    // Method to calculate factorial iteratively
    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
