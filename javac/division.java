import java.util.Scanner;
public class division{
public static void main(String... args){
  
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first number: ");
  Float firstNumber = input.nextFloat();

  System.out.print("Enter second number: ");
  float secondNumber = input.nextFloat();

  float total = firstNumber / secondNumber;

  System.out.println(subtraction(total));

}

public static float subtraction(float number){
 return number;
}
}