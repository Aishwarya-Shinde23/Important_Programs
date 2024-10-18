package Basic_Java_Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number, a, b, temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = s.nextInt();

		b = number;
		while (number > 0) {
			a = number % 10;
			number = number / 10;
			temp = temp * 10 + a;

		}
		if (temp == b) {
			System.out.println(b + " : is a Palindrome Number");
		} else {
			System.out.println(b + " : is not a Palindrome Number");
		}

	}

}
