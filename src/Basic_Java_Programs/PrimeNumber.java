package Basic_Java_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number: ");
		number = s.nextInt();
		
		if(isPrime(number)) {
			System.out.println(number + " : is a Prime number");
		}
		else {
			System.out.println(number + " : is not a Prime number");
		}
	}

	public static boolean isPrime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}
}
