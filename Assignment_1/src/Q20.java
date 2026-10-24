//Write a Java program to find the remainder (when one nonzero integer number is divided by another nonzero integer number) without using the % operator.
import java.util.Scanner;
public class Q20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend and divisor below: ");
		int dividend=sc.nextInt(); int divisor=sc.nextInt();
		
		int remainder=dividend-(dividend/divisor)*divisor;
		System.out.println("Remainder: "+(remainder));
	}

}
