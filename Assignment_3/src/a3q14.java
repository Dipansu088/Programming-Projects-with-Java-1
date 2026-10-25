//Write a Java program to find the difference between the sum of the squares and the square of the sum of the first one hundred natural numbers. e.g. The sum of the squares of the first ten natural numbers is:12 + 22 + ... + 102 = 385, similarly the square of the sum of the first ten natural numbers is: (1 + 2 + ... + 10)2 = 552 = 3025. Hence the difference between the sum of the squares and the square of the sum of the first ten natural numbers is: 3025 − 385 = 2640.

public class a3q14 {

	public static void main(String[] args) {
		int sum=0; int sumofsquares=0;
		for (int i=1; i<=1000; i++) {
			sum=sum+i;
			sumofsquares=sumofsquares+(i*i);
		}
		int squareofsum=sum*sum;
		int difference=squareofsum-sumofsquares;
		System.out.println(difference);
	}

}
