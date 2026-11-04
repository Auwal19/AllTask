import java.util.Scanner;

public class creditCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a credit card number: ");
        String cardNumber = input.nextLine().trim();
        
        int len = cardNumber.length();

        if (len < 13 || len > 16) {
            System.out.println("Invalid input: Card must be between 13 and 16 digits.");
            input.close();
            return;
        }

	String cardType = "Unknown Pattern";
        if (cardNumber.startsWith("4")) {
            cardType = "Visa Card";
        } else if (cardNumber.startsWith("5")) {
            cardType = "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            cardType = "American Express Card";
        } else if (cardNumber.startsWith("6")) {
            cardType = "Discover Card";
        }
	
	int sum1 = 0;
	for(int i = len - 2; i >= 0; i -= 2) {
		int digit = Character.getNumericValue(cardNumber.charAt(i));
		int doubled = digit * 2;
}
    }
}
