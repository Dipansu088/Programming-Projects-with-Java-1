//Write a Java program to swap two numbers using a third variable and also without using a third variable.
import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		int a=sc.nextInt(); int b=sc.nextInt();
		
		int temp=a; a=b; b=temp;
		System.out.println("With using 3rd variable, a="+a+", b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Without using 3rd variable, a="+a+", b="+b);
		
	}

}
