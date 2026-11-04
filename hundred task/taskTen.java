import java.util.Scanner;

public class taskTen{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();

        int age = 2025 - yearOfBirth;

        System.out.println("\n--- PROFILE ---");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Age: " + age);
    }
}