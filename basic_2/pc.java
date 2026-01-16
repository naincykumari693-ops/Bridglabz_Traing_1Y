import java.util.Scanner;
public class pc
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		double base= sc.nextDouble();
		double exponent= sc.nextDouble();
		double result= Math.pow(base,exponent);
		
		System.out.println(base+"raised to the power of"+exponent+"is"+result);
	}
}