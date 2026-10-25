//Write a Java program to read a number and print the corresponding day of the week using switch-case statement (e.g. 1 for Monday … 7 for Sunday).
import java.util.*;
public class a2q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number between 1 and 7: ");
		int n=sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Invalid"); break;
		}
			
	}

}
