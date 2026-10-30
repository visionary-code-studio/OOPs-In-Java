import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Apply the conversion formula: F = (C * 9/5) + 32
        // Note: Use 9.0 / 5.0 to ensure floating-point division
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Display the result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        // Close the scanner resource
        scanner.close();
    }
}
