//Write a Java program to input a string message and display it 10 times in the following manner using while loop. e.g. Let the entered string message be “Hello”. The output would be like:
//1st Hello
//2nd Hello
//3rd Hello
//4th Hello
//5th Hello
//6th Hello
//7th Hello
//8th Hello
//9th Hello
//10th Hello
import java.util.*;
public class a3q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string message: ");
		String msg=sc.next();
		int i=1;
		while(i<=10) {
			if (i==1) System.out.println(i+"st "+msg);
			else if (i==2) System.out.println(i+"nd "+msg);
			else if (i==3) System.out.println(i+"rd "+msg);
			else {
				System.out.println(i+"th"+msg);
			}
			i++;
		}
	}

}
