package Basic_Java_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number, factorial=1;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number : ");
		number = s.nextInt();
		
		for(int i=1; i<=number; i++) {
			factorial = factorial *i;
		}
		System.out.println("Factorial of " + number + " is : " + factorial);
	}

}
