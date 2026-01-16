import java.util.Scanner;
public class distance
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter distance in feets");
		int feet= sc.nextInt();
		int yards=(feet*3);
		int miles= (yards*1760);
		System.out.println("the distance in feet is:"+feet+",yards is:"+yards+"and in miles is:"+miles);
	}
}