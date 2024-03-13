import java.util.Scanner;
public class vowels{
	static boolean flag;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)=='a' ||s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
			 flag=true;
			 break;
			}
			else{
			flag=false;
			}
		}
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
