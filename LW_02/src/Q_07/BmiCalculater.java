package Q_07;
import java.util.Scanner;

public class BmiCalculater {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height in cm: ");
            double height = scanner.nextDouble();

            double bmi = weight / Math.pow(height / 100.0, 2);


            System.out.printf("Your BMI is: %.2f\n", bmi);

            scanner.close();
        }
    }


