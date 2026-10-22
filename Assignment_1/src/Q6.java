//Write a Java program to calculate the area and perimeter of a square and a rectangle.
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of side of square: ");
		int s=sc.nextInt();
		System.out.println("Enter length and breadth of rectangle: ");
		int l=sc.nextInt(); int b=sc.nextInt();
		
		System.out.println("Area of square: "+(s*s));
		System.out.println("Perimeter of square: "+(4*s));
		System.out.println("Area of rectangle: "+(l*b));
		System.out.println("Perimeter of rectangle: "+(2*(l+b)));
		sc.close();
	}

}
