import java.util.Scanner;
class table{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int  a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(;a<=b;a++)
		{
			for(int i=1;i<=10;i++)
			{
				int c= a * i;
				System.out.println( +a+ "*" +i+ "=" +c );
			}
		System.out.println();
		}
	}
}