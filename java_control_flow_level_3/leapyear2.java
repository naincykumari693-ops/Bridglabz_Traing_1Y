import java.util.*;
class leapyear2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a ;
		System.out.print("enter a year: ");
		a = sc.nextInt();
		if((a%100!=0 && a%4==0) || a%400==0)
		{
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}