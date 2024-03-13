import java.util.Scanner;
class checkNUmber{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check");
	int num=sc.nextInt();
	if(num>1 & num <50)
		System.out.println("The number is in the lower half");
	else if(num>51 & num<100)
		System.out.println("The number is in the upper half");
	else
		System.out.println("Invalid number");
	}
}
