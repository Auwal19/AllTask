public class AbsoluteValue {

    public static void main(String[] args) {

        int[] numbers = {-10, 5, -20, 8, -3};

        for (int i = 0; i < numbers.length; i++) {

            int absoluteValue = Math.abs(numbers[i]);

            System.out.println(numbers[i] + " = " + absoluteValue);
        }
    }
}