package Basic_Java_Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number, a, b, arm = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = s.nextInt();

		b = number;
		while (number > 0) {
			a = number % 10;
			number = number / 10;
			arm = arm + a * a * a;

		}

		if (arm == b) {
			System.out.println(b + " : is an Armstrong Number");
		} else {
			System.out.println(b + " : is not an Armstrong Number");
		}

	}

}
