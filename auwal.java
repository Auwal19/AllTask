
  import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer: ");
            int num1 = input.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = input.nextInt();

            System.out.print("Enter third integer: ");
            int num3 = input.nextInt();

            System.out.print("Enter fourth integer: ");
            int num4 = input.nextInt();

            System.out.print("Enter fifth integer: ");
            int num5 = input.nextInt();

            int Largest = num1;
            int Smallest = num1;

            if (num2 > Largest)
                Largest = num2;
            if (num3 > Largest)
                Largest = num3;
            if (num4 > Largest)
                Largest = num4;
            if (num5 > Largest)
                Largest = num5;

            if (num2 < Smallest)
                Smallest = num2;
            if (num3 < Smallest)
                Smallest = num3;
            if (num4 < Smallest)
                Smallest = num4;
            if (num5 < Smallest)
                Smallest = num5;

            System.out.println("Largest integer: " + Largest);
            System.out.println("Smallest integer: " + Smallest);
        }
    }


