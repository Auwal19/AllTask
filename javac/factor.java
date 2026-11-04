import java.util.Scanner;
public class factor {
 public static void main(String... args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number: ");
   int number = input.nextInt();

   factors(number);
    }

public static void factors(int number) {
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
System.out.println(i);
}
}
}
}