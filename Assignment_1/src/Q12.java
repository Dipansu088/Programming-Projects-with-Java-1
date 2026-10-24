//Write a Java program to swap two numbers using a third variable and also without using a third variable.
import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers below.");
		int a=sc.nextInt(); int b=sc.nextInt();
		System.out.println("Swap using a third variable.");
		int temp;
		temp=a; a=b; b=temp;
		System.out.println("a"+a); System.out.println("b"+b);
		
		System.out.println("Without using third variable");
		a=a+b; b=a-b; a=a-b;
		System.out.println("a: "+a); System.out.println("b: "+b);
	}

}
