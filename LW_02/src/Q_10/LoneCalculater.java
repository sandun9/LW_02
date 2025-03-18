package Q_10;
import java.util.Scanner;

public class LoneCalculater {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final int MONTHS_IN_YEAR = 12;


            System.out.print("Enter the loan amount: ");
            double loanAmount = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (in %): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the loan period (in years): ");
            int loanPeriod = scanner.nextInt();

            // Convert annual interest rate to monthly interest rate
            double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

            // Calculate the number of payments (months)
            int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

            // Calculate monthly payment using the formula
            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            // Calculate total
            double totalPayment = monthlyPayment * numberOfPayments;


            System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
            System.out.printf("Total Payment: %.2f\n", totalPayment);


            scanner.close();
        }
    }


