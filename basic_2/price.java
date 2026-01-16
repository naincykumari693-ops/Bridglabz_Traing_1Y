import java.util.Scanner;
public class price
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the unit price of product");
		int unitprice= sc.nextInt();
		System.out.println("enter the quantity of product");
		int quantity= sc.nextInt();
		int totalprice= unitprice*quantity;
		System.out.println("the total purchase price is INR"+totalprice+"  if the quantity"+quantity+"  and unitprice is"+unitprice);
	}
}