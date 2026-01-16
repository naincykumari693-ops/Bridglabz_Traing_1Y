import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		double num_1=sc.nextDouble();
		
		System.out.println("enter second number");
		double num_2=sc.nextDouble();
		
		System.out.println("enter third number");
		double num_3=sc.nextDouble();
		
		double average= (num_1+num_2+num_3)/3;
		
		System.out.println("average is :"+average);
	}
}