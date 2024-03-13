import java.util.Scanner;

public class FrequentCharacter{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine().toLowerCase();
		int max=0;
		char res=' ';
		for(int i=0;i<s.length();i++){
		int count=0;
			for(int j=i+1;j<s.length();j++){
			
				if(s.charAt(i)==s.charAt(j)){
				
					count++;	
					
				}
			
			}
			if(count>max){
			
				max=count;
				res=s.charAt(i);
			
			}
		
		
		}
	
	System.out.println("The most Frequent character is: "+res);
	
	}


}
