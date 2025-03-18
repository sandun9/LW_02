package Q_02;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Enter your length in cm:");
        Double Length=scanner.nextDouble();

        //calculation

        double inches=(int)(Length / 2.54);
        int Feet=(int)(inches/12);
        inches=(Feet%12);

        System.out.println(Length+" cm ="+Feet+" ft " +inches +" inch");
    }
}
