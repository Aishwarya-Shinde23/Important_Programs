package String_Programs;

public class NumberOfCharacter {

	public static void main(String[] args) {
		String s = "Selenium Automation Project using Java";

		char ch = 'u';

		int count = s.length() - s.replace("u", "").length();

		System.out.println("Number of occurences of character " + ch + " in given string = " + count);
	}

}
