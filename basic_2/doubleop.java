import java.util.Scanner;
public class doubleop
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of a");
		double a= sc.nextDouble();
		System.out.println("enter value of b");
		double b= sc.nextDouble();
		System.out.println("enter value of c");
		double c= sc.nextDouble();
		double op1= a+b*c;
		double op2= a*b+c;
		double op3= c+a/b;
		double op4= a%b+c;
		System.out.println("the result of double operations are:" +op1+ ","+op2+ ","+op3+","+op4);
	}
}