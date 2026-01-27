import java.util.*;
class evenodd{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a ;
		System.out.println("enter the first number ");
		a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			if (i%2==0)
			{
				System.out.println("the even number is: "+i);
				
			}
			else 
			{
				System.out.println("the odd number is: "+i);
			}
		}
		
	}
}