import java.util.Scanner;
public class handshakes
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of students");
		int n= sc.nextInt();
		int handshakes=(n*(n-1)/2);
		System.out.println("the number of possible handshakes is:"+handshakes);
	}
}