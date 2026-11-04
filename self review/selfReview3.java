import java.util.Scanner;
public class selfReview3{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 System.out.print("Enter user name: ");
 String name = input.next(); 
 
 System.out.print("Enter password: ");
 String pass = input.next(); 

 String userName = "Auwal";
 String password = "oracle";
 
 if(name.equalsIgnoreCase(userName)){
	if (pass.equals(password)){
	 System.out.print("Login successful");
	}
	else{
         System.out.print("Wrong password");
	}
 }
else{
 System.out.print("invalid");
}

}
}