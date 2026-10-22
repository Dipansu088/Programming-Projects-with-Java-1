//Write a Java program to calculate the area of a triangle when its base and height are given.
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height of a triangle: ");
		int b=sc.nextInt(); int h=sc.nextInt();
		System.out.println("Area of triangle: "+(0.5*b*h));
		sc.close();
	}

}
