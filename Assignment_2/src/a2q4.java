//Given three points (x1, y1), (x2, y2) and (x3, y3), write a Java program to check if all the three points fall on one straight line.
//(Hint: Three points are collinear, if slope of one set of points = slope of other set of points.)
import java.util.*;
public class a2q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x1 y1");
		int x1=sc.nextInt(); int y1=sc.nextInt();
		
		System.out.println("Enter x2 y2");
		int x2=sc.nextInt(); int y2=sc.nextInt();
		
		System.out.println("Enter x3 y3");
		int x3=sc.nextInt(); int y3=sc.nextInt();
		
		if ((y2-y1)*(x3-x2)==(y3-y2)*(x2-x1)) {
			System.out.println("Straight line");
		}
		else {
			System.out.println("Not straight line");
		}
	}

}
