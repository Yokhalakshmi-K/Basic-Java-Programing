import java.util.Scanner;
public class SumOfElements{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum of elements: "+sum);
	}

}
