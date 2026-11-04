import java.util.Scanner;
public class largestNumber{
   public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
int[] array = new int[5];
for (int counter = 0; counter < array.length; counter++){
System.out.print("Enter Number ");
int firstNumber = input.nextInt();
array[counter] = firstNumber;

}
for (int counter = 0; counter < array.length; counter++) {
System.out.println(array[counter] + " ");
}
int largest = array[0];
int smallest = array[0];
int average = 0;
for (int counter = 0; counter < array.length; counter++){
 if(array[counter] > largest){
 largest = array[counter];
 } 
 if(array[counter] < smallest){
 smallest = array[counter];
}
}

System.out.println("The largest number is" + largest);

 System.out.println("The Smallest number is" + smallest);

int sum = 0;

for(int count = 0; count < array.length; count++){

	sum += array[count];
}


	average = sum/array.length;
System.out.print(average);
}
}