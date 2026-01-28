import java.util.*;
class count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter a number: ");
		n = sc.nextInt();
		int count =0;
		int temp =n;
		while (temp!=0)
		{
			count++;
			temp = temp/10;
		}
		System.out.println("the number of digit is: "+count);
	}
}