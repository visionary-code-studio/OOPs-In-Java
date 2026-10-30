import java.util.Scanner;

public class StringArrayProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of strings (n)
        System.out.print("Enter the number of strings (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strArray = new String[n];

        // Input n strings
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strArray[i] = scanner.nextLine();
        }

        // a) Display all strings
        System.out.println("\n--- a) All Strings ---");
        for (String s : strArray) {
            System.out.println(s);
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

        System.out.println("\n--- b) Longest String ---");
        System.out.println(longest + " (Length: " + longest.length() + ")");

        System.out.println("\n--- c) Shortest String ---");
        System.out.println(shortest + " (Length: " + shortest.length() + ")");

        // d) Display the strings in reverse order
        System.out.println("\n--- d) Strings in Reverse Order ---");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(strArray[i]);
        }

        scanner.close();
    }
}
