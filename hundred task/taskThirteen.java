import java.util.Scanner;
public class taskThirteen{
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter price: ");
	double price = input.nextDouble();

	System.out.print("Enter quantity: ");
	double quantity = input.nextDouble();
	
	double subtotal = price * quantity;
	double VAT = subtotal * 0.025;
	double total = subtotal + VAT;

	System.out.print(total);
    }
}


