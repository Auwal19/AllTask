import java.util.Scanner;
public class isEven{
public static void main(String... args){
  
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter second number: ");
  int secondNumber = input.nextInt();

  System.out.println(isEven(firstNumber));
  System.out.println(isEven(secondNumber));
}

public static boolean isEven(int number){
if (number % 2 == 0){
  return true;
}
else{
  return false;
}
}
}