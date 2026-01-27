import java.util.*;
class powerwhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("enter a number: ");
		a= sc.nextInt();
		
		if (a>0)
		{
			System.out.println("positive number");
		}
		else 
		{
			System.out.println("not positive");
		}
		System.out.print("enter a power: ");
		b= sc.nextInt();
		int result =1 ;
		int i =1;
		while(i<=b)
		{
			i++;
			result*=a;
		}
		System.out.println("the power of result is: "+result);
	}
}
		