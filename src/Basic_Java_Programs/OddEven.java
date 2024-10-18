package Basic_Java_Programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number=s.nextInt();
		
		if(number%2==0) {
			System.out.println(number + " : is an even number");
		}
		else {
			System.out.println(number + " : is an odd number");
		}

	}

}
