import java.util.Scanner;
public class ArrayReverse{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of String");
		int n=sc.nextInt();
		String[] arr=new String[n];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next();
			}
			System.out.println("The Reverse Array is:");
		for(int i=arr.length-1;i>=0;i--){
		
			System.out.println(arr[i]+" ");
		
		}
		
	}

}
