//Write a Java program find the sum, difference, multiplication, division, and remainder of two given integer numbers.
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt(); int b=sc.nextInt();
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		sc.close();
	}
	

}
