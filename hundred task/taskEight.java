import java.util.Scanner;

public class taskEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.printf("The area of the circle is %.2f%n", area);
    }
}