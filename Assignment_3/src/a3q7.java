//Write a Java program to read an integer number and display the sum of the digits of that number.
import java.util.*;
public class a3q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer: ");
		int n=sc.nextInt();
		
		int i=0;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum: "+sum);
	}

}
