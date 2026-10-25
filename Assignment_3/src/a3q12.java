//Write a Java program to check whether a given integer number is a perfect number or not. Note: If the sum of the proper positive divisors (excluding the number itself) of that number is equal to the number itself, then the number is called a perfect number.
import java.util.*;
public class a3q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect number");
		}
		else System.out.println("Not perfect");
	}

}
