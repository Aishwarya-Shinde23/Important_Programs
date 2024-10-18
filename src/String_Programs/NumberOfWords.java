package String_Programs;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		
		int count = 1;
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i=0; i<s.length()-1; i++) {
			if((s.charAt(i)== ' ') && (s.charAt(i+1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in string entered are : " + count);
	}

}
