import java.util.Scanner;
class ContainJava{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine().toLowerCase();
	if(str.contains("java"))
		System.out.println("The Given String contains java");
	else
		System.out.println("The given String does not contain java");
	}
}
