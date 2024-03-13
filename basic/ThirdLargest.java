import java.util.Scanner;
public class ThirdLargest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[i]<a[j]){
				
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				
				}
			
			}
			
		}
		System.out.println(a[2]);
	}

}	 vc
