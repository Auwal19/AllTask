import java.util.Scanner;
public class TaskThree{
   public static void main(String[]args){
	Scanner input = new Scanner(System.in);
        
	System.out.print("Enter first number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter second number: ");
	int numberTwo = input.nextInt();

	System.out.print("Enter third number: ");
	int numberThree = input.nextInt();

	System.out.print("Enter fourth number: ");
	int numberFour = input.nextInt();

	System.out.print("Enter fifth number: ");
	int numberFive = input.nextInt();

	System.out.print("Enter sixth number: ");
	int numberSix = input.nextInt();

	System.out.print("Enter seventh number: ");
	int numberSeven = input.nextInt();

	System.out.print("Enter Eight number: ");
	int numberEight = input.nextInt();

	System.out.print("Enter ninth number: ");
	int numberNine = input.nextInt();

	System.out.print("Enter tenth number: ");
	int numberTen = input.nextInt();

	int sum = numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix + numberSeven + numberEight + 	numberNine + numberTen;

	int average = 0;
	average = sum /2;
	
	System.out.println("The average is: " + average);
	System.out.println("The sum is: " + sum);

}	

}
