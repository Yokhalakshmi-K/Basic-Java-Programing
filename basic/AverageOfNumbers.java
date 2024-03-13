import java.util.Scanner;
public class AverageOfNumbers{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int num[]=new int[n];
		int sum=0;
		float avg;
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
			sum=sum+num[i];
		}
		avg=sum/n;
		System.out.println("The average of numbers in the list is " +avg);

    }
}
