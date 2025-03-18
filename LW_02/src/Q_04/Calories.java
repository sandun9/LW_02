package Q_04;
import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your Weight in Pounts:");
        Double Weight=scanner.nextDouble();

        Double calories=(Weight *19);

        System.out.println("Daily Calaries Needs:"+calories+" calaries");

        scanner.close();

    }
}
