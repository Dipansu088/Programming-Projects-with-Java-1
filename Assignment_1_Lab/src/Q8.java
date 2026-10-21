//Write a Java program to convert kilometres into metres and centimetres.

import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length in Kilometres: ");
		double km=sc.nextDouble();
		
		System.out.println("length in metres: "+(km*1000));
		System.out.println("length in cm: "+(km*100000));
		sc.close();
	}

}
