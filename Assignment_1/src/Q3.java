//Write a Java program to print the following pattern:
//*
//**
//***
//****
//*****
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows u wanna print: ");
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

}
