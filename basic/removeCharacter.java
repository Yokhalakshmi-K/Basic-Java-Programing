import java.util.Scanner;
public class removeCharacter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the character to be removed");
		char ch=sc.next().charAt(0);
		String str = ""+ch;
		str=str.toLowerCase();
		char sj = (char) ((int) str.charAt(0)-32); // to uppercase
		
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=str.charAt(0) && s.charAt(i)!=sj)
			{
			   res+=Character.toString(s.charAt(i));
			}
		
		}
	System.out.println("The string after removing the given character: "+res);
	
	}

}
