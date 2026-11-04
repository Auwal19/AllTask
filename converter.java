import java.util.Scanner;
public class converter{
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		
		
	   int swap = firstNumber;
	   firstNumber = secondNumber;
	   secondNumber = swap;
	
	   System.out.println("first number = " + firstNumber);
	   System.out.println("second number = " + secondNumber);
	   
	   
	}
}