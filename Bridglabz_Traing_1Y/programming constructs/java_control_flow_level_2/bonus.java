import java.util.Scanner;
class bonus
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter amount of salary :");
		int a=sc.nextInt();
		System.out.print("enter year of service :");
		int b=in.nextInt();
		if(b>=5)
		{
			int c=(a/100)*5;
			System.out.println("bonus "+c);
		}
		else
		{
			System.out.println("bonus= 0");
		}
		
	}
}