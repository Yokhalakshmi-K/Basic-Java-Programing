import java.util.Scanner;

public class Fibbonacci{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of String");
		
		int n1=0,n2=1,n3;
		System.out.println("The fibbonacci series is:");
		for(int i=0;i<10;i++){
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
	
	}

}
