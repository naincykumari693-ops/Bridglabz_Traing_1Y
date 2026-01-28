import java.util.Scanner;
public class largest_no
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first no.");
		int a = sc.nextInt();
		System.out.println("enter the second no.");
		int b= sc.nextInt();
		System.out.println("enter the third no.");
		int c= sc.nextInt();
		if (a>b && a>c){
		System.out.println("first number is the largest");}
		else if(b>a && b>c){
		System.out.println("second number is the largest");}
		else{
		System.out.println("third number is the largest");}
		
	}
	
}