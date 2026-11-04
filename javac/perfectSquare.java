import java.util.Scanner;
public class perfectSquare{
 public static void main(String... args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number: ");
   int number = input.nextInt();

   System.out.println(isPerfectSquare(number));
    }

public static boolean isPerfectSquare(int number) {
int squareRoot = (int) Math.sqrt(number);
if (squareRoot * squareRoot == number) {
 return true;
} 
else {
 return false;
}
}
}