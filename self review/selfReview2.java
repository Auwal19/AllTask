import java.util.Scanner;
public class selfReview2{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);


   
 float discount;
 float amount;
 float finalAmount;

 System.out.print("Enter purchase amount: ");
 amount = input.nextFloat(); 

 if (amount > 50000){
 discount = amount / 10;
}
 else{
 discount = 0;
}
float Total = amount - discount;

System.out.println("Original amount: " + amount);
System.out.println("Discount: " + discount);
System.out.println("Final amount: " + Total);
}
}