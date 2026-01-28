import java.util.*;
class armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,sum=0,original;
		System.out.print("enter a number: ");
		a = sc.nextInt();
		original=a;
		int d = 0;
		int i =1;
		
		while (a!=0)
		{
			
			 d = a%10;
			sum= sum+(d*d*d);
			a=a/10;
			i++;
		}
		if (original==sum)
		{
			System.out.println("it is a armstrong number ");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
	}
}