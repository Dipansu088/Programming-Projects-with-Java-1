//Write a Java program that prints the roots of the polynomial ax2+bx+c. Print an appropriate message if the discriminant is negative, and behaves appropriately (avoiding division by zero) if „a‟ is zero.
import java.util.*;
public class a2q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the coefficients: ");
		int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
		int D=(b*b)-4*a*c;
		
		if (a==0) {
			System.out.println("Not a valid polynomial");
		}
		else {
			if (D<0) {
				System.out.println("no roots");
			}
			else {
				double r1=(-b-(Math.sqrt(D))/(2*a));
				double r2=(-b+(Math.sqrt(D))/(2*a));
				System.out.println(r1);
				System.out.println(r2);
			}
		}
	}

}
