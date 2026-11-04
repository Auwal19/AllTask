import java.util.Scanner;
public class selfReview1{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 System.out.print("Enter an integer: ");
 int number = input.nextInt(); 
 


 if (number >= 0){
 System.out.println("positive");
}
 if (number < 0){
 System.out.println("Negative");
}
 if (number == 0){
 System.out.println("zero");
}

}
}