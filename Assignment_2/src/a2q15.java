//Write a Java program to read the previous month and the current month meter reading and calculate the electricity bill amount to be paid based on units consumed as per the following rule:
//● 0 – 100 units → ₹5/unit
//● 101–200 units → ₹7/unit
//● Above 200 units → ₹10/unit
import java.util.*;
public class a2q15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the previous month and current month reading: ");
		double pr=sc.nextDouble(); double cr=sc.nextDouble();
		double bill=0;
		
		double consumed=cr-pr;
		if (consumed>0 && consumed<=100) {
			 bill=consumed*5;
		}
		else if (consumed>101 && consumed<=200) {
			 bill=consumed*7;
		}
		else if (consumed>200) {
			 bill=consumed*10;
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Bill: "+bill);
	}

}
