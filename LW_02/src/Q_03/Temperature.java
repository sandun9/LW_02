package Q_03;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your Temperature in celsius:");
        double celsius=scanner.nextDouble();

        double fahrenheit=(1.8*celsius)+32;

        System.out.println("Temperature in F:" +fahrenheit);
    }
}
