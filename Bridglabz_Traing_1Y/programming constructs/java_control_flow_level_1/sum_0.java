import java.util.Scanner;
class sum_0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a;
		double sum=0;
		a=sc.nextInt();
		
		while(a!=0)
		{
			sum= sum+a;
			a=sc.nextInt();
		}
	System.out.println(+sum);
		
		
	}
}