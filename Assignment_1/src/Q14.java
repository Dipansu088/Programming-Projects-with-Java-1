//Write a Java program to convert a given number of days into years, months, and days.
import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of days.");
		int totalDays=sc.nextInt();
		
		int years=totalDays/356;
		int remainingDays=totalDays%365;
		
		int months=remainingDays/30;
		int days=remainingDays%30;
		
		System.out.println("Years: "+(years)+", Months: "+(months)+", Days: "+(days));
	}

}
