import java.util.Scanner;
public class sum2
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks in physics");
		int physics= sc.nextInt();
		System.out.println("enter the marks in maths");
		int maths= sc.nextInt();
		System.out.println("enter marks in chemistry");
		int chemistry=sc.nextInt();
		double average= (maths+physics+chemistry)/3;
		System.out.println("average of subjects is:"+average);
		
		
	}
}