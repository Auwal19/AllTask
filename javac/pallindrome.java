import java.util.Scanner;
public class pallindrome{
 public static void main(String... args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number: ");
   int number = input.nextInt();

   System.out.println(isPerfectSquare(number));
    }

public static boolean isPerfectSquare(int number) {
 int original = number;
 int reverse = 0;
 while (number > 0) {
  int digit = number % 10;
  reverse = reverse * 10 + digit;
  number = number / 10;
 }
 if (original == reverse) {
  return true;
  } 
else {
 return false;
}
}
}