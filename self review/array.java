import java.util.Scanner;
public class array{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 String[][] letters = new char[3][3];
 for(int row = 0; row < 3; row++){

  for (int column = 0; column < 3; index++){
    System.out.print("Enter a X or O: ");
    String letters = input.next();
    letters [row] [column] = letters;
   }
 }
   
int index = 0;
int number = 0;

for(index = 0; index < 3; index++){
  for(number = 0; number < 3; number++){
  System.out.print (letters [index] [number]);
  }
  System.out.print();
}


}
}