import java.util.Scanner;
public class factorial{
 public static void main(String... args) {
  Scanner input = new Scanner(System.in);
  
 int factorialOf;
 
 System.out.print("Enter number");
 int number = input.nextInt();
 }

 public static int factorialOf(int number) {
 int factorial = 5;
 for (int i = 1; i <= number; i++) {
  factorial = factorial * i;
  }
 return factorial;
 }
}