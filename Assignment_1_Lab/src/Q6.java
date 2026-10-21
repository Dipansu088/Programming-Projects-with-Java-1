//Write a Java program to calculate the area and perimeter of a square and a rectangle.
//area of square: sxs, perimeter: 4xs
//area of rectangle: lxb, perimeter: 2xl+b
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square: ");
		int side=sc.nextInt();
		System.out.println("Enter the length and breadth of the rectangle: ");
		double l=sc.nextDouble(); double b=sc.nextDouble();
		
		System.out.println("Area of square: "+(side*side));
		System.out.println("Perimeter of square: "+(4*side));
		System.out.println("Area of rectangle: "+(l*b));
		System.out.println("Perimeter of rectangle: "+(2*(l+b)));
		sc.close();
	}

}
