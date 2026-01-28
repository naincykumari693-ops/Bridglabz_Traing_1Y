import java.util.*;
class gwhilefactor
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a;
		System.out.print("enter a number: ");
		a=sc.nextInt();
		int gt=1;
		int i=a-1;
		while(i>=1)
		{
			i--;
			if(a%i==0)
			{
				gt=i;
				break;
			}
		}
		System.out.println("the greatest factor is: "+gt);
		
	}
}