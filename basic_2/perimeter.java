import java.util.Scanner;
public class perimeter
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the perimeter of square");
		int perimeter= sc.nextInt();
		int side= (perimeter/(4));
		System.out.println("the side of square is:"+side+"whose perimeter is:"+perimeter);
	}
}