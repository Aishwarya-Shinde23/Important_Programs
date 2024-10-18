package String_Programs;

public class ReverseEachWord {

	public static void ReverseEachWord(String InputString) {

		String[] str = InputString.split(" ");
		String reverseString = "";

		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);

			}
			reverseString = reverseString + reverseWord + " ";

		}

		System.out.println(InputString);
		System.out.println(reverseString);
	}
	
	public static void main(String[] args) {

		ReverseEachWord("Java is a good programming language");

	}

}
