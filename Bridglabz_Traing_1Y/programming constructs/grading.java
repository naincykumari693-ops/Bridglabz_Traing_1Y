import java.util.Scanner;
public class grading
{
	public static void main(String[]args)
	{
		for (int i =0;i<=10;i++);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		if (marks<50){
		System.out.println("fail");}
		else if(marks>=50 && marks<60){
		System.out.println("c");}
		else if(marks >= 60 && marks<70){
		System.out.println("c+");}
		else if(marks >=70 && marks<80){
		System.out.println("B");}
		else if(marks >=80 && marks<90){
		System.out.println("B+");}
		else if (marks >=90 && marks<=100){
		System.out.println("A+");}
		else if (marks <=0){
		System.out.println("invalid input");}
		else{
		System.out.println("invalid input");}
		
		
	}
}