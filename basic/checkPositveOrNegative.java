import java.util.Scanner;
class checkPositveOrNegative{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num>0)
System.out.println("NUmber is positive");

else if(num<0)
System.out.println("Number is negative");

else
System.out.println("NUmber is zero");

}
}
