//Write a Java program to calculate the volume of a cylinder.
//V = π × r² × h

import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of cylinder: ");
		double r=sc.nextDouble();
		System.out.println("Enter the height of cylinder: ");
		double h=sc.nextDouble();
		
		System.out.println("The volume of cylinder is: "+(3.14*r*r*h));
		sc.close();
	}

}
