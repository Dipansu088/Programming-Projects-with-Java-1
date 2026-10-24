//Write a Java program to convert the temperature in Celsius into Fahrenheit and vice versa.
import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius.");
		double c = sc.nextDouble();
		System.out.println("fahrenheit: "+((c*9.0/5.0)+32));
		System.out.println("Enter temperature in Fahrenheit.");
		double f=sc.nextDouble();
		System.out.println("Celsius: "+((f-32)*5.0/9.0));
		sc.close();
	}

}
