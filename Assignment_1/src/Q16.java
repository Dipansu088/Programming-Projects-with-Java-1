//Write a program in Java to display sum of the digits of a two-digit integer number.
import java.util.*;
public class Q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the integer number: ");
		int n=sc.nextInt();
		int digit=n%10;
		int temp=n/10;
		sum=digit+temp;
		System.out.println("sum is: "+(sum));
		
	}

}
