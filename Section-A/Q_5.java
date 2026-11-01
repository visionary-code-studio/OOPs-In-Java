import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        // a) Find the length of the string
        System.out.println("\n==== Length of a String ====");
        System.out.println("Length of \"" + str + "\" is " + str.length());

        // b) Convert the string to uppercase and lowercase
        System.out.println("\n==== Case Conversion ====");
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("LowerCase: " + str.toLowerCase());

        // c) Display the character at a user-specified position (0-indexed or 1-indexed safety)
        System.out.println("\n==== Display a Character ====");
        System.out.println("Enter the position (0 to " + (str.length() - 1) + "):");
        int pos = sc.nextInt();
        if (pos >= 0 && pos < str.length()) {
            System.out.println("Character at position " + pos + " is " + str.charAt(pos));
        } else {
            System.out.println("Pls, Enter a valid position!");
        }

        // d) Extract a substring from the given string
        System.out.println("\n==== Substring Check ====");
        System.out.println("Enter the starting index:");
        int start = sc.nextInt();
        System.out.println("Enter the ending index:");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start <= end) {
            System.out.println("Substring: " + str.substring(start, end));
        } else {
            System.out.println("Invalid Indices!");
        }

        sc.close();
    }
}
