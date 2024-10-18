package Basic_Java_Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, a, remainder, reverse = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = s.nextInt();
		a = number;

		while (number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reversed number is : " + reverse);

	}

}
