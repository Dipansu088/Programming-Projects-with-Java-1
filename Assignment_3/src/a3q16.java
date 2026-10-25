//Write a Java program to print the largest power of two less than or equal to N. (i.e. 2x <=N, find x)
import java.util.*;
public class a3q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int power=1;
		int x=0;
		
		while(power*2<=n) {
			power=power*2;
			x++;
		}
		System.out.println("Largest power of 2 is: "+power);
	}

}
