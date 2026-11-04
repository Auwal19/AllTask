import java.util.Scanner;
public class numbers{
   public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int[] array = new int[5];
	
	for (int i = 1; i < array.length; i++){
	System.out.print("Enter Number " + (i+ 0) + ":" + " ");
	int number = input.nextInt();
	array[i] = number;

}
	for (int i = 1; i < array.length; i++) {
	System.out.println(array[i]);
	}
}
}
