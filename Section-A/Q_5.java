import java.util.Scanner;

public class StringOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // a) Find the length of the string
        int length = str.length();
        System.out.println("a) Length of the string: " + length);

        // b) Convert the string to uppercase and lowercase
        System.out.println("b) Uppercase: " + str.toUpperCase());
        System.out.println("b) Lowercase: " + str.toLowerCase());

        // c) Display the character at a user-specified position
        System.out.print("c) Enter an index position (0 to " + (length - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < length) {
            char ch = str.charAt(index);
            System.out.println("   Character at index " + index + ": " + ch);
        } else {
            System.out.println("   Invalid index! Please enter a position within the range.");
        }

        // d) Extract a substring from the given string
        System.out.print("d) Enter start index for substring: ");
        int start = scanner.nextInt();
        System.out.print("   Enter end index for substring: ");
        int end = scanner.nextInt();

        try {
            String subStr = str.substring(start, end);
            System.out.println("   Extracted substring: " + subStr);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("   Invalid index range for substring extraction.");
        }

        scanner.close();
    }
}
