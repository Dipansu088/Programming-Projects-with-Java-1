//The body mass index (BMI) is computed by taking the individual's weight in kilograms and dividing it by the square of the height in meters. i.e. BMI =weight/ (height)2
//Write a Java program to find the BMI of a person for given values of height and weight and also print the category to which the person belongs to as per the given table.
//BMI
//Category
//Less than 18.5
//Underweight
//18.5 to 24.9
//Normal weight
//25.0 to 29.9
//Overweight
//30.0 or more
//Obese
import java.util.*;
public class a2q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter height and weight: ");
		double w=sc.nextDouble(); double h=sc.nextDouble();
		
		double BMI=w/(h*h);
		
		if (BMI<18.5) {
			System.out.println("Underweight");
		}
		else if ((BMI>=18.5 && BMI<=24.9)) {
			System.out.println("Normal weight");
		}
		else if((BMI>=25.0 && BMI<=29.9)) {
			System.out.println("Overweight");
		}
		else if (BMI>=30.0) {
			System.out.println("Obese");
		}
		else {
			System.out.println("not valid");
		}
	}

}
