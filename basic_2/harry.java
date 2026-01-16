import java.util.Scanner;
public class harry
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the birthyear of harry");
		int birthyear= sc.nextInt();
		System.out.println("enter the current year of harry");
		int currentyear= sc.nextInt();
		int age= currentyear-birthyear;
		System.out.println("age of harry is:"+age);

	}
}