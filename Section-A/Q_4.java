import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean checkAnagram(String str1, String str2) {
        // Remove all whitespaces and convert to lowercase for an accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        // The replaceAll regex pattern "\\s" matches any whitespace character
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are completely equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check and print the result
        if (checkAnagram(firstString, secondString)) {
            System.out.println("\"" + firstString + "\" and \"" + secondString + "\" are anagrams.");
        } else {
            System.out.println("\"" + firstString + "\" and \"" + secondString + "\" are NOT anagrams.");
        }

        // Close the scanner resource to avoid memory leaks
        scanner.close();
    }
}
