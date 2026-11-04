public class method{
public static void main(String... args){
int result = maximum(10, 20);
System.out.print("The maximum is: " + result);
}

public static int maximum(int a, int b){
if (a > b){
return a;
}
else{
return b;
}
}
}