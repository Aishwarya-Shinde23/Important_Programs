package Basic_Java_Programs;

import java.util.Scanner;

public class Fibionacci {

	public static void main(String[] args) {
		int number, first, second, next;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = s.nextInt();
		first = 0;
		second = 1;

		System.out.println("Fibonacci series is : ");
		for (int i = 0; i < number; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}

	}

}
