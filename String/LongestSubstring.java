import java.util.Scanner;

public class LongestSubstring{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int maxLength=0;
		int end=0,start=0;
		System.out.println("Enter the String");
		String s=sc.next();
		while(end<s.length()){
		for(int i=start;i<end;i++){
		
			
			if(Character.toLowerCase(s.charAt(end))==Character.toLowerCase(s.charAt(i))){
			
				start=i+1;
				
				break;
				
			}
			}
			maxLength=Math.max(maxLength,end-start+1);
			end++;
			
		
		}
		System.out.println(maxLength);
	
	}

}
