//Write a Java program to compute the sales price of an item for a given original price and discount percentage.
import java.util.*;
public class Q18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the original price: ");
		double op=sc.nextDouble();
		System.out.println("Enter discount percentage: ");
		double dp=sc.nextDouble();
		double discountAmt=(op*dp)/100;
		double salesPrice=op-discountAmt;
		System.out.println("sales price="+(salesPrice));
		System.out.println("discount amount="+(discountAmt));
	}

}
