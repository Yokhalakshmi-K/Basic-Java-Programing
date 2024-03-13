import java.util.Scanner;
public class SortNames{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of names");
		int n=sc.nextInt();
		String temp="";
		String[] names=new String[n];
		System.out.println("Enter the names");
		for(int i=0;i<n;i++){
			names[i]=sc.next();
		}
		for(int i=0;i<names.length;i++){
			int pos=0;
			for(int j=1;j<names.length-i;j++){
			while(pos<names[j].length() && pos<names[j-1].length()&& 
				Character.toLowerCase(names[j].charAt(pos)) == Character.toLowerCase(names[j-1].charAt(pos))){
				
					pos++;
				
				}
			if(pos<names[j].length() && pos<names[j-1].length() &&
				Character.toLowerCase(names[j].charAt(pos)) < Character.toLowerCase(names[j-1].charAt(pos))){
					
					temp=names[j-1];
					names[j-1]=names[j];
					names[j]=temp;
				
				}
		
		}
		}
		System.out.println("The sorted Names are: ");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]+" ");
		}
		
		
	}
}
