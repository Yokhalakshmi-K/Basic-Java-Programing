import java.util.Scanner;
import java.util.Arrays;
public class Anagram{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String s1=sc.nextLine();
		System.out.println("Enter the String2:");
		String s2=sc.nextLine();
		char ch1[]=new char[s1.length()];
		char ch2[]=new char[s2.length()];
		char temp;
		boolean flag=true;
		if(s1.length()!=s2.length()){
			
			System.out.println("Not an Anagram!");
			return;
		
		}
		ch1=s1.toCharArray();
		ch2=s2.toCharArray();
		for(int i=0;i<ch1.length;i++){
		
			for(int j=i+1;j<ch1.length;j++){
			
				if(ch1[i]>ch1[j]){
				
					temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				
				}
			
			}
		
		}
		for(int i=0;i<ch2.length;i++){
		
			for(int j=i+1;j<ch2.length;j++){
			
				if(ch2[i]>ch2[j]){
				
					temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				
				}
			
			}
		
		}
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		for(int i=0;i<ch1.length;i++){
			
			for(int j=0;j<ch2.length;j++){
			
				if(ch1[i]!=ch2[j]) {
					flag=false;
				} else {
					flag=true;
				}
				
			}
		}
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
	
	}

}
