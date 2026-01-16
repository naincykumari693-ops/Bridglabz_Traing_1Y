import java.util.Scanner;
public class triangle
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the base");
		int base= sc.nextInt();
		System.out.println("enter the height");
		int height= sc.nextInt();
		int area= (base*height/(2));
		System.out.println("area of triangle is:"+area);
	}
}