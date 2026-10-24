//Write a Java program to convert kilometres into metres and centimetres.
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter distance in km: ");
		int km=sc.nextInt();
		
		System.out.println("distance in metres: "+(km*1000));
		System.out.println("Distance in cm: "+(km*100000));
	}

}
