package Q_09;
import java.util.Scanner;

public class InvesmentCalculater {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get inputs from the user
            System.out.print("Enter the principal amount (P): ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (R) in percentage: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the number of years (N): ");
            int years = scanner.nextInt();

            // Compute future value using the formula: P(1 + R/100)^N
            double futureValue = principal * Math.pow((1 + rate / 100), years);

            // Display the result
            System.out.printf("The future value of the investment is: %.2f\n", futureValue);

            // Close scanner
            scanner.close();
        }
    }


