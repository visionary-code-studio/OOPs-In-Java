/* Write a Java program to store n strings in a String array and perform the following operations: 
a) Display all strings. b) Find the longest string. c) Find the shortest string. d) Display the strings in reverse order.
*/

import java.util.Scanner;

public class StringArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] strArray = new String[n];

        // Input n strings
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strArray[i] = scanner.nextLine();
        }

        // a) Display all strings
        System.out.println("\na) All strings in the array:");
        for (String s : strArray) {
            System.out.println("- " + s);
        }

        // b) Find the longest string
        // c) Find the shortest string
        String longest = strArray[0];
        String shortest = strArray[0];

        for (int i = 1; i < n; i++) {
            if (strArray[i].length() > longest.length()) {
                longest = strArray[i];
            }
            if (strArray[i].length() < shortest.length()) {
                shortest = strArray[i];
            }
        }

        System.out.println("\nb) Longest string: " + longest + " (Length: " + longest.length() + ")");
        System.out.println("c) Shortest string: " + shortest + " (Length: " + shortest.length() + ")");

        // d) Display the strings in reverse order
        System.out.println("\nd) Strings in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("- " + strArray[i]);
        }

        scanner.close();
    }
}
