import java.util.Scanner;
import java.util.Random;
class RandomNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	int max=100;
	int count=0;
	int n=rand.nextInt(max);
	
	while(true){
	System.out.println("Enter the gussed number");
	int guess=sc.nextInt();
		if(guess>n){
			System.out.println("Too high");
			count++;
		}
		else if(guess<n){
		System.out.println("Too low");
		count++;
		}
		else{
		System.out.println("correct answer");
		break;
		}
		
	
	    }
	System.out.println("You have attempt:"+count);
	}
}
