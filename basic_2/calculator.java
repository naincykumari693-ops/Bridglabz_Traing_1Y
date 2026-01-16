import java.util.Scanner;
public class calculator
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1");
		int num1= sc.nextInt();
		System.out.println("enter num2");
		int num2= sc.nextInt();
		int add= num1+num2;
		int sub= num1-num2;
		int multi= num1*num2;
		int div= num1/num2;
		System.out.println("the addition,subtraction,multiplication  and devision of num1 and num2 is:"+add+","+sub+","+multi+"and"+div);
	}
}