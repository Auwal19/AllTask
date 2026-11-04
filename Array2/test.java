import java.util.Scanner;
public class test{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();

		char[] vowel = {'a','e','i','o','u'};
		int counter = 0;
		String reversed = " ";
		name = name.toLowerCase();
		
		for(int index = name.length() -1; index >= 0; index--){
			for(int count = 0; count < vowel.length; count++){
				if (vowel[count] == name.charAt(index)){
					counter++;
				}
				if (index == count){
					index = -1;
				}
				
			}
			
			reversed += name.charAt(index);
			
		}

		
		System.out.println(index);
		System.out.println(reversed);
		System.out.println(counter);
		
}
}

























