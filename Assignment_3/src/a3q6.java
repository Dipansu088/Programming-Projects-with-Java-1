//Write a Java program to find the LCM and GCD/HCF of two integer numbers using loop.
import java.util.*;
public class a3q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt(); int b=sc.nextInt();
		
		int gcd=1;
		for (int i=1; i<=a && i<=b; i++) {
			if (a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		int lcm=(a*b)/gcd;
		System.out.println("LCM: "+lcm);
		System.out.println("GCD: "+gcd);
	}

}
