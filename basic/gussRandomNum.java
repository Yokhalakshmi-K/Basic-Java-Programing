import java.util.Scanner;
import java.util.Random;
class gussRandomNum
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	int max=10;
	int n;

	n=rand.nextInt(max);
	System.out.println(n);
	
	int count=0;
		while(true)
		{
		      System.out.println("Enter the Number");
		      int guess=sc.nextInt();
		      
			if(guess>n){
				System.out.println("too high");
				count++;
			}
			else if(guess<n){
				System.out.println("too low");
				count++;
			}
			else
			{
				System.out.println("correct answer");
			      	break;
			}
			
		}
		System.out.println(count+"times of you have to try");
	}

}
