import java.util.Scanner;
public class student
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of students");
		int students= sc.nextInt();
		System.out.println("enter the number of pens");
		int pen= sc.nextInt();
		int devision= pen/students;
		System.out.println("pens distributed between students is:"+devision);
		int remaining= pen-(students*devision);
		System.out.println("remaining pens are:"+remaining);
		
		
	}
}