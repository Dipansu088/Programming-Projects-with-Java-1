//Write a Java program to accept the marks of a student in three subjects and calculate:
//a. Total marks
//b. Average marks
//c. Percentage
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of student in 3 subjects: ");
		double a=sc.nextDouble(); double b=sc.nextDouble(); double c=sc.nextDouble();
		System.out.println("Total marks: "+(a+b+c));
		System.out.println("Avg mmarks: "+((a+b+c)/3));
		System.out.println("Percentage: "+(((a+b+c)/300)*100));
	}

}
