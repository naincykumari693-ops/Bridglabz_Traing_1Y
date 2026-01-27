import java.util.*;
class prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("enter a number:  ");
		a = sc.nextInt();
		for(int i=2;i<=a;i++)
		{
		if (i%2!=0 || i==2)
		{
			System.out.println("prime number is:  "+i);
			System.out.println(" ");
		}
		else 
		{
			System.out.println("not prime number: "+i);
		}
	}
}
}