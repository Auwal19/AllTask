import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in m: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.60934;

        System.out.println("Distance in miles: " + miles);
        System.out.println("Distance in kilometers: " + kilometers);
    }
}