import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TemperatureConvertor {

    //celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("+---------------------------------------------------------");
        System.out.println("|            Temperature Convertor                        |");
        System.out.println("+---------------------------------------------------------");

        System.out.println("\t[01]. Celsius to Fahrenheit");
        System.out.println("\t[01]. Fahrenheit to Celsius");
        System.out.println("\t[01]. Celsius to Kelvin");
        System.out.println("\t[01]. Kelvin to Celsius");
        System.out.println("\t[01]. Exit");

        System.out.print("\n\nSelect an option to continue -> ");
    }
}
