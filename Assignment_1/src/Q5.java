//Write a Java program to calculate the area and circumference of a circle.
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		int r=sc.nextInt();
		System.out.println("Area of circle: "+(3.14*r*r));
		System.out.println("Circumference of circle: "+(2*3.14*r));
	}

}
