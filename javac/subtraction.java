import java.util.Scanner;
public class subtraction{
public static void main(String... args){
  
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter second number: ");
  int secondNumber = input.nextInt();

  int total = firstNumber - secondNumber;

  System.out.println(subtraction(total));

}

public static int subtraction(int number){
 return Math.abs(number);
}
}