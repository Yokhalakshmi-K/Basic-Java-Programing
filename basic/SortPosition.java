import java.util.*;
public class SortPosition{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of elements");
	int n=sc.nextInt();
	int a[]=new int[n];
	int odd[]=new int[n];
	int even[]=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int temp;
	for(int i=1;i<a.length;i+=2){
		for(int j=i+2;j<a.length;j+=2){
		if(a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}	
	}
	for(int i=0;i<a.length;i+=2){
		for(int j=i+2;j<a.length;j+=2){
		if(a[i]<a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}	
	}
	System.out.println(Arrays.toString(a));
	
	}

}
