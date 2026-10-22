//Write a Java program to calculate the volume of a cylinder.
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r=sc.nextInt();
		System.out.println("Enter the height: ");
		int h=sc.nextInt();
		
		System.out.println("The volume of cylinder is: "+(0.5*r*r*h));
		sc.close();
	}

}
