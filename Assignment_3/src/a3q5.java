//Write a Java program to read an integer number and display the factorial value of that number.
import java.util.*;
public class a3q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		
		int factorial=1;
		for (int i=1; i<=n; i++) {
			factorial=factorial*i;
		}
		System.out.println("Factrial: "+factorial);
	}

}
