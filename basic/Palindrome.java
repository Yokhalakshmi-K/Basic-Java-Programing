import java.util.Scanner;
public class Palindrome{
	static boolean flag;
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=s.length();
	String str="";
	char ch[]=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--){
		str=str+ch[i];
	}
	
		
		for(int i=0;i<s.length()-1;i++){
			
				if(s.charAt(i)==str.charAt(i)){
					
					flag = true;
					continue; 
					//System.out.println("Palindrome");
					
				} else {
					flag = false;
				}
				
				
			}
			
			if(flag) {
				
				System.out.println("Palindrome");
			} else {
				System.out.println("not Palindrome");
				}
				
		//Another method
				/*boolean flag=false;
				for(int i=0;i<n/2;i++){
					if(s.charAt(i)==s.charAt(n-i-1))
						flag=true;
				}
				if(flag){
				System.out.println("Palindrome");
				} else {
				System.out.println("not Palindrome");
				}*/
					
		}
	}
   

