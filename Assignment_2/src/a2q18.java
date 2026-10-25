//Write a Java program that takes an integer as input and prints the message "Acceptable" if the number is divisible by either 5 or 3. Otherwise print the message “Not Acceptable”.
import java.util.*;
public class a2q18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer: ");
		int n=sc.nextInt();
		
		if (n%5==0 || n%3==0) {
			System.out.println("Acceptable");
		}
		else {
			System.out.println("Not acceptable");
		}
	}

}
