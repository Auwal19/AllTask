import java.util.Scanner;
public class TaskFive{
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
	
	int evenNumber = 0;

	int sum = numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix + numberSeven + numberEight + 		numberNine + numberTen;

	if (numberOne % 2 == 0){
	    evenNumber = evenNumber + numberOne;
	}

	if (numberTwo % 2 == 0){
	    evenNumber = evenNumber + numberTwo;
	}

	if (numberThree % 2 == 0){
	    evenNumber = evenNumber + numberThree;
	}

	if (numberFour % 2 == 0){
	    evenNumber = evenNumber + numberFour;
	}

	if (numberFive % 2 == 0){
	    evenNumber = evenNumber + numberFive;
	}

	if (numberSix % 2 == 0){
	    evenNumber = evenNumber + numberSix;
	}

	if (numberSeven % 2 == 0){
	    evenNumber = evenNumber + numberSeven;
	}

	if (numberEight % 2 == 0){
	    evenNumber = evenNumber + numberEight;
	}

	if (numberNine % 2 == 0){
	    evenNumber = evenNumber + numberNine;
	}

	if (numberTen % 2 == 0){
	    evenNumber = evenNumber + numberTen;
	}
	System.out.print(evenNumber);
}	

}
