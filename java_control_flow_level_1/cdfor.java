import java.util.Scanner;
class cdfor{
	public static  void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a ;
		a=sc.nextInt();
		int b;
		int count=0;
		
		for(;a>0;)
		{
			b=a-1;
			if (b%10==0)
			{
				count++;
			}
			a=a/10;
		}
		System.out.println("the count is: " +count);
	}
}