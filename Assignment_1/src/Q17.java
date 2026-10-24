//Write a program in Java to display reverse number of a two-digit integer number.
import java.util.*;
public class Q17 {

	public static void main(String[] args) {
		int n=12;
		int rev=0;
		while (n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse: "+(rev));
	}

}
