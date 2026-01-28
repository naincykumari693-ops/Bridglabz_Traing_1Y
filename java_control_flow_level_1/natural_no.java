import java.util.Scanner;
class natural_no{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>0){
			int sum = n*(n+1)/2;
			System.out.println("the sum of : "+n+"natural no. is"+sum);
		}
		else {
			System.out.println("the number is not a natural number");
		}
	}
}