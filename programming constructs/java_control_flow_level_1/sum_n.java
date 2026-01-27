import java.util.Scanner;
class sum_n
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sumwhile=0;
		System.out.print("enter natural number ");
		a = sc.nextInt();
		int i =1;
		while(i<=n)
		{
			sumwhile=i+sumwhile;
			i++;
		}
		int sum = n*(n+1)/2;
		System.out.println("the sumwhile is: "+sumwhile);
		System.out.println("the sum is: "+sum);
		if (sumwhile==sum)
		{
			System.out.println("the result is correct");
		}
		else
		{
			System.out.println("the result is incorrect");
		}
	}
}