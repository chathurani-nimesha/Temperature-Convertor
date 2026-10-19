import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConvertor {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException(
                    "Kelvin cannot be below zero."
            );
        }
        return kelvin - 273.15;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("+-----------------------------------------------+");
            System.out.println("|             TEMPERATURE CONVERTER           |");
            System.out.println("+-----------------------------------------------+");

            System.out.println("\t[1]. Celsius to Fahrenheit");
            System.out.println("\t[2]. Fahrenheit to Celsius");
            System.out.println("\t[3]. Celsius to Kelvin");
            System.out.println("\t[4]. Kelvin to Celsius");
            System.out.println("\t[5]. Exit");
            System.out.print("Select an option: ");

            try {
                int choice = Integer.parseInt(input.nextLine());

                if (choice == 5) {
                    running = false;
                    System.out.println("Thank you for using the converter!");
                    continue;
                }

                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid menu option!");
                    continue;
                }

                System.out.print("Enter temperature: ");
                double temperature =
                        Double.parseDouble(input.nextLine());

                double result;

                switch (choice) {
                    case 1:
                        result = celsiusToFahrenheit(temperature);
                        System.out.printf("Fahrenheit: %.2f °F%n", result);
                        break;

                    case 2:
                       result = fahrenheitToCelsius(temperature);
                       System.out.printf("Celsius: %.2f °C%n", result);
                        break;

                    case 3:
                        result = celsiusToKelvin(temperature);
                        System.out.printf("Kelvin: %.2f K%n", result);
                        break;

                    case 4:
                        result = kelvinToCelsius(temperature);
                        System.out.printf("Celsius: %.2f °C%n", result);
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid input! Please enter a valid number."
                );

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        input.close();
    }
}
