import java.util.*;
class young
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("enter the age and height amar: ");
		a=sc.nextInt();
		System.out.print("enter the age and  height anthony : ");
		b=sc.nextInt();
		System.out.print("enter the age and height akbar: ");
		int c=sc.nextInt();
		if (a<b && a<c)
		{
			System.out.println("amar is youngest: " +a);
		}
		else if (b<a && b<c)
		{
			System.out.println("anthony is youngest: " +b);
		}
		else if(c<a && c<b)
		{
			System.out.println("akbar is youngest: " +c);
		}
		System.out.println("enter the height amar: ");
		int p=sc.nextInt();
		System.out.println("enter the height anthony : ");
		int q=sc.nextInt();
		System.out.println("enter the height akbar: ");
		int r=input.nextInt();
		if(p>q && p>r)
		{
			System.out.print("amar is tallest");
		}
		if(q>p && q>r)
		{
			System.out.print("anthony is tallest");
		}
		if(r>q && r>p)
		{
			System.out.print("akbar is tallest");
		}
	}
}