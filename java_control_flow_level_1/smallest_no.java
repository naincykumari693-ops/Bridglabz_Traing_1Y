import java.util.Scanner;
public class smallest_no
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first no.");
		int a= sc.nextInt();
		System.out.println("enter second no.");
		int b= sc.nextInt();
		System.out.println("enter third no.");
		int c= sc.nextInt();
		if(a<b && a<c){
		System.out.println("first no. is the smallest");}
		else if( b<a && b<c){
		System.out.println("second no. is the smallest");}
		else{
		System.out.println("third no. is the smallest");}
	}
}