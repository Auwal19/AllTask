import java.util.Scanner;
public class method{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter first integer: ");
	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;

	System.out.print(sum);

}
}