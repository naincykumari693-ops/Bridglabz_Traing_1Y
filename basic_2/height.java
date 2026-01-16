import java.util.Scanner;
public class height
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter height in centimeters");
		double hcm= sc.nextDouble();
		double hinches= hcm/2.54;
		double feet = (hinches/12);
		double inches= hinches%12;
		System.out.println("height in cm is:"+hcm+"in feet is:"+feet+"in inches is:"+hinches);
	}
}