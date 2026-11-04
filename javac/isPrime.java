import java.util.Scanner;
public class evenNUmbers{
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
if (number < 2){
  return false;
}
for(i = 1; i < number; i++){
  if (number % i == 0){
    return false;

  }
}
return true;
}
}
}