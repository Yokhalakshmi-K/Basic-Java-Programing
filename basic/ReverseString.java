import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String originalStr=sc.nextLine();
	char ch[]=originalStr.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	
	}
}
