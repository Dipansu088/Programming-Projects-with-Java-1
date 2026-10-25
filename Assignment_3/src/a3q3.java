//Write a Java program that reads three integers from the user and displays the all integer numbers starting from the first number up to the second number and with an increment value of the third number. e.g. if the first number= 5, the second number= 22 and the third number= 3 then the output should be: 5 8 11 14 17 20
import java.util.*;
public class a3q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integers: ");
		int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
		
		for (int i=a; i<=b; i=i+c) {
			System.out.println(i);
		}
	}

}
