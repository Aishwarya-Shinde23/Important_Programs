package Basic_Java_Programs;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		int number, a = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = s.nextInt();

		if (number < 0) {
			number = number * -1;
		} else if (number == 1) {
			number = 1;
		}

		while (number > 0) {
			number = number / 10;
			a++;
		}

		System.out.println("Total number of digits are : " + a);
	}

}
