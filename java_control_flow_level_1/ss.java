import java.util.Scanner;
class ss{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	    System.out.println(" enter the month");
		int a=sc.nextInt();
		System.out.println("enter the date");
		int b= sc.nextInt();
		if((a==3 && b>=20) || (a==4) || (a==5) || (a==6 && b<=20 ))
		{
			System.out.println("spring season: ");
		}
		else{
			System.out.println("not spring season");
		}
		
	}
}