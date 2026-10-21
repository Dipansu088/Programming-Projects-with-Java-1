//Write a Java program to display your name, age, course, roll number, and college name.

import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name, age, course, roll number, and college names respectively: ");
		String name=sc.nextLine();
		int age=sc.nextInt();
		String course=sc.next();
		String regNo=sc.next();
		String clgName=sc.next();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Course: "+course);
		System.out.println("Registeration Number: "+regNo);
		System.out.println("University: "+clgName);
		sc.close();

	}

}
