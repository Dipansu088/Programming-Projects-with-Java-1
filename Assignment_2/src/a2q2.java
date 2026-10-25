//Write a Java program to find the smallest among five numbers.
import java.util.*;
public class a2q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt(); int d=sc.nextInt(); int e=sc.nextInt();
		
		int smallest=a;
		if (b<smallest) {
			smallest=b;
		}
		if (c<smallest) {
			smallest=c;
		}
		if (d<smallest) {
			smallest=d;
		}
		if (e<smallest) {
			smallest=e;
		}
		System.out.println("Smallest: "+(smallest));
	}

}
