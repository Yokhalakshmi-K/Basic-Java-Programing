import java.util.Scanner;

public class AverageOfElements{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int sum=0;
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		float avg=sum/n;
		System.out.println("The average of the element is: "+avg);
		
	
	}

}
