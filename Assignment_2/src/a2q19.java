//Write a Java program to assign an exam hall based on roll number:
//● Roll number ending with 0–3 → Hall A
//● Ending with 4–6 → Hall B
//● Ending with 7–9 → Hall C.
import java.util.*;
public class a2q19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number: ");
		int r=sc.nextInt();
		int ending=r%10;
		switch (ending) {
		case 0: case 1: case 3: System.out.println("Hall A"); break;
		case 4: case 5: case 6: System.out.println("Hall B"); break;
		case 7: case 8: case 9: System.out.println("Hall C"); break;
		default: System.out.println("Invalid");
		}
	}

}
