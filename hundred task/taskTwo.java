import java.util.Scanner;
public class taskTwo{
        public static void main(String[] args){
    	Scanner input = new Scanner(System.in);

        System.out.print("What your name: ");
	String name = input.nextLine();
        System.out.print("How old are you: ");
	int age = input.nextInt();

	System.out.print("Your name is " +name+ " You are " +age+ " years old");
	
    }

}
