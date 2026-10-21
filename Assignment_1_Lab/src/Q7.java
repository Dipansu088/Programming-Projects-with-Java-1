//Write a Java program to calculate the area of a triangle when its base and height are given.
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height of the triangle respectively: ");
		double b=sc.nextDouble(); double h=sc.nextDouble();
		
		System.out.println("The area of triangle is: "+(0.5*(b*h)));
		sc.close();
	}

}
