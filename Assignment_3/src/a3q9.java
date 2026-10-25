//Write a program in Java to display the first „N‟ terms of a Fibonacci series (where the value of „N‟ is accepted from the user).
import java.util.*;
public class a3q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for (int i=1;i<=n;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
