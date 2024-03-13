import java.util.Scanner;
class celToFar{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the celsius");
float cel=sc.nextFloat();
float far=((cel*9/5)+32);
System.out.println("The fahrenheit is"+far);
}
}
