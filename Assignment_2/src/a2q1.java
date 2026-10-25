//Write a Java program to check whether a given number is positive, negative or zero. Also check whether that number is odd or even.
import java.util.*;
public class a2q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		if (n>0) System.out.println("Positive");
		else if (n<0) System.out.println("Negative");
		else System.out.println("Zero");
		
		if (n%2==0) System.out.println("Even");
		else System.out.println("Odd");
	}

}
