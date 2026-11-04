import java.util.Scanner;
public class square{
 public static void main(String... args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number: ");
   int number = input.nextInt();

 System.out.println("Square is: " + square(number));
    }

 public static int square(int number) {
        return number * number;
    }
}