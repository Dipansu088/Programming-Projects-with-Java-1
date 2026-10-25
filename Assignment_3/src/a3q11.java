//Write a Java program to display all the Armstrong numbers between 1 and 500. Note: If sum of the cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
import java.util.*;
public class a3q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int i=1; i<=500; i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int digit=num%10;
				sum=sum+(digit*digit*digit);
				num=num/10;
			}
			if (sum==i) {
				System.out.println(i);
			}
		}
	}

}
