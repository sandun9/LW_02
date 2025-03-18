package Q_05;
import java.util.Scanner;

public class Faran_to_cel {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input: Temperature in Fahrenheit
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            // Conversion formula
            double celsius = (5.0 / 9) * (fahrenheit - 32);

            // Output result
            System.out.println("Temperature in Celsius: " + String.format("%.2f", celsius));

            scanner.close();
        }
    }


