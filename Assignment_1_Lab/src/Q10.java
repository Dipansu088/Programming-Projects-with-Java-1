//Write a Java program to convert the temperature in Celsius into Fahrenheit and vice versa.

import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius: ");
		double c=sc.nextDouble();
		double f=(c*9/5)+32;
		System.out.println("Temperature in fahrenheit: "+f);
		double c2=(f-32)*5/9;
		System.out.println("Temperature in celsius from fahrenheit: "+c2);
		
		sc.close();
	}

}
