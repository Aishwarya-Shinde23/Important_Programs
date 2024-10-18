package Basic_Java_Programs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		a = s.nextInt();

		System.out.print("Enter value of b : ");
		b = s.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Value of a after swapping : " + a);
		System.out.print("Value of b after swapping : " + b);

	}

}
