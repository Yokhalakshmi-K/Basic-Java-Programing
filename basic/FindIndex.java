import java.util.Scanner;
public class FindIndex
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to find the index of given element");
		int element=sc.nextInt();
		int index =-1;
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i])
			{
			  index = i;
			  break;
			} 
		}
	    System.out.println("The index of given element is "+index);
	}

}
