import java.util.*;
class Naturalnum_sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sumfor=0;
		System.out.print("enter natural number");
        n = sc.nextInt();
		for (int i=1;i<=a;i++)
		{
			  sumfor= i+sumfor;
			
		}
		 int sum= n*(n+1)/2;
		System.out.println("the sum of for is: "+sumfor);
		System.out.println("the sum of result is: "+sum);
		if (sumfor==sum){
			System.out.println("the result is correct");
		}
		else
		{
			System.out.println("the result is not correct");
		}
	}
}