//Write a Java program to display the multiplication table of a number entered by the user.( e.g. If the entered number is 6 then the output is like :
//6 * 1 = 6
//6 * 2 = 12
//……
//……
//6 * 9 = 54
//6 * 10 = 60
import java.util.*;
public class a3q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
