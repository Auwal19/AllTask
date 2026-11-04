import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int minimum = numbers[0];
        int maximum = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }
}