//Write a Java program to read an integer number and check whether it is prime number or not. Also extend the same program to display all the prime numbers between a range of given numbers.
import java.util.*;
public class a3q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a=sc.nextInt();
		int count=0;
		for (int i=1; i<=a; i++) {
			if (a%i==0) {
				count++;
			}
		}
		if (count==2) System.out.println("Prime");
		else System.out.println("Not prime");
		
		System.out.println("Enter range: ");
		int start=sc.nextInt(); int stop=sc.nextInt();
		for (int j=start; j<=stop; j++) {
			count=0;
			for (int i=1; i<=j; i++) {
				if(j%i==0) {
					count++;
				}
			}
			if (count==2) System.out.print(j+" ");
		}
	}

}
