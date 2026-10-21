//Write a Java program to calculate the area and circumference of a circle.
//1. Area of Circle:A = π × r²
//Circumference (perimeter) of Circle:C = 2 × π × r

import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r=sc.nextDouble();
		
		System.out.println("The area of circle is: "+(3.14*r*r));
		System.out.println("The circumference of circle is: "+(2*3.14*r));
		sc.close();

	}

}
