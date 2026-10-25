//Write a Java program using for loop to display the sum of the first „N‟ natural numbers and also the sum of „N‟ integer numbers accepted from the user (the value of „N‟ is also accepted from the user).
import java.util.*;
public class a3q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int naturalSum=0;
		for (int i=1; i<=n; i++) {
			naturalSum=naturalSum+i;
		}
		System.out.println("Sum of n natural numbers: "+(naturalSum));
		int integerSum=0;
		
		System.out.println("enter "+n+" integers:");
		for (int i=1; i<=n; i++) {
			System.out.println("Enter "+i+" number: ");
			int a=sc.nextInt();
			
			integerSum=integerSum+a;
		}
		System.out.println("integer sum: "+(integerSum));
	}

}
