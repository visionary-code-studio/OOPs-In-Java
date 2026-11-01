import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Initialize counters
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specialChars = 0;
        
        // Define a lookup string for vowels (both lowercase and uppercase)
        String vowelList = "aeiouAEIOU";
        
        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // Check if the character is an alphabet letter
            if (Character.isLetter(ch)) {
                // Check if the letter is a vowel
                if (vowelList.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            // Check if the character is a numerical digit
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            // Check if the character is a white space
            else if (Character.isWhitespace(ch)) {
                spaces++;
            } 
            // Anything else is classified as a special character
            else {
                specialChars++;
            }
        }
        
        // Print the results
        System.out.println("\n--- Character Analysis Results ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChars);
        
        // Close the scanner resource
        scanner.close();
    }
}
