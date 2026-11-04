public class Average {

    public static double average(int... numbers) {

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }

    public static void main(String[] args) {

        System.out.println("Average: " + average(10, 20));

        System.out.println("Average: " + average(10, 20, 30));

        System.out.println("Average: " + average(5, 10, 15, 20));

        System.out.println("Average: " + average(2, 4, 6, 8, 10));
    }
}

