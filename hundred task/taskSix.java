import java.util.Scanner;
public class taskSix{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter first integer: ");
	int firstNumber = input.nextInt();
	System.out.print("Enter second integer: ");
	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;
	int difference = firstNumber - secondNumber;
	int quotient = firstNumber / secondNumber;
	int product = firstNumber * secondNumber;
	
	System.out.println(sum);
	System.out.println(difference);
	System.out.println(product);
	System.out.println(quotient);
}
}