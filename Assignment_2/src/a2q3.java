//Write a Java program to accept a student‟s marks out of 100 and print “Pass” if marks ≥ 40 otherwise print “Fail”.
import java.util.*;
public class a2q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		double marks=sc.nextDouble();
		
		if (marks>=40) System.out.println("Pass");
		else System.out.println("Fail");
	}

}
