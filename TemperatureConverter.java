import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("Enter '1' for Celsius to Fahrenheit conversion");
            System.out.println("Enter '2' for Fahrenheit to Celsius conversion");
            System.out.println("Enter '3' to quit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println("Result: " + fahrenheit + " degrees Fahrenheit");
            } else if (choice == 2) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println("Result: " + celsius + " degrees Celsius");
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
