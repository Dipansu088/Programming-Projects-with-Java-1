//Write a Java program that reads day, month, and year and determine whether the entered date is valid. Consider the different number of days in each month and leap years.
import java.util.*;
public class a2q20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date (dd mm yyyy): ");
		int day=sc.nextInt(); int month=sc.nextInt(); int year=sc.nextInt();
		int maxDays;
		
		if (year<=0 || month<1 || month>12) {
			System.out.println("invalid date");
		}
		else {
			if (month==2) {
				if ((year%400==0) || (year%4==0 || year%100!=0)) {
					maxDays=29;
				}
				else {
					maxDays=28;
			}
			}
			else if (month==4 || month==6 || month==9 || month==11) {
				maxDays=30;
			}
			else {
				maxDays=31;
			}
			
			if (day>=1 && day<=maxDays) {
				System.out.println("Valid Date");
			}
			else {
				System.out.println("Invalid Date");
			}
		}
	}

}
