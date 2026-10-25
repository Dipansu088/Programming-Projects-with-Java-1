//Write a Java program to print the following pattern using loop.
//1
//1 2 1
//1 2 1 3 1 2 1
//1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
//1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
import java.util.*;
public class a3q17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto: ");
		int upto=sc.nextInt();
		String temp="";
		for(int i=1; i<=upto;i++) {
			System.out.print(temp);
			System.out.print(i+" ");
			System.out.print(temp);
			temp=temp+i+" "+temp;
			System.out.println();
		}
	}

}
