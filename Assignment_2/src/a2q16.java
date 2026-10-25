//Write a Java program to read the length of three sides of a triangle and check if the triangle is equilateral, isosceles, or scalene. (Equilateral Triangle: All three sides are equal in length, Isosceles Triangle: Two sides are equal in length, Scalene Triangle: All three sides have different lengths)
import java.util.*;
public class a2q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 sides: ");
		int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
		
		if (a==b && b==c) {
			System.out.println("Equilateral");
		}
		else if (a==b || b==c || a==c) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}
	}

}
