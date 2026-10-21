//Write a Java program to calculate the square and cube of a number.
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		double n=sc.nextDouble();
		System.out.println("Square: "+(n*n));
		System.out.println("Cube: "+(n*n*n));
		sc.close();
	}

}
