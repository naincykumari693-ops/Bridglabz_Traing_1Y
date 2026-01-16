import java.util.Scanner;
public class SI
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter principle");
		double p= sc.nextDouble();
		
		System.out.println("enter rate of interest");
		double r= sc.nextDouble();
		
		System.out.println("enter time");
		double t= sc.nextDouble();
		
		double simple_interest= (p*r*t)/100;
		
		System.out.println("principle:"+p);
		System.out.println("rate of interest:"+r);
		System.out.println("time:"+t);
		
		System.out.println("simple interest is:" +simple_interest);
		
		
	}
	
	
	
}