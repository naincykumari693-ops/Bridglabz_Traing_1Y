import java.util.Scanner;
class fizzbuzzwhile{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int a ;
		
		a=sc.nextInt();
		int i=1;
		
		while(i<=a)
		{
		if (i%3==0 && i%5==0){
			System.out.println("fizzbuzz");
		}
		else if (i%3==0)
		{
			System.out.println("fizz");
		}
		else if (i%5==0)
		{
			System.out.println("buzz");
		}
		else {
			System.out.println(i);
		}
			
		i++;	
		}
	}
}