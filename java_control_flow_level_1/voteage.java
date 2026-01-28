import java.util.Scanner;
class voteage{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int age= sc.nextInt();
		if (age>=18){
			System.out.println("this person can vote");
		}
		else{
			System.out.println("this person cannot vote");
		}
		}
}