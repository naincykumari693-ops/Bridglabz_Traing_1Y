import java.util.Scanner;
public class farenhite
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp in celsius");
		int celsius= sc.nextInt();
		
		int temp= (celsius*9/5)+32;
		System.out.println("temp in farenhite is:"+temp);
		
		
		
		
		
	}
	
	
	
	
	
}