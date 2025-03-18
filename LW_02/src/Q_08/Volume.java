package Q_08;
import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // input
            System.out.print("Enter the radius of the sphere: ");
            double radius = scanner.nextDouble();

            // Compute the volume
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            // output
            System.out.printf("The volume of the sphere is: %.2f cubic units\n", volume);

            scanner.close();
        }
    }


