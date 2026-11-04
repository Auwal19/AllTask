import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter a number: ");
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length; index++) {
            for (int count = index + 1; count < numbers.length; count++) {
                if (numbers[index] == numbers[count]) {
                    numbers[index] = -1;
                }
            }
        }

        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }

        System.out.println();
    }
}