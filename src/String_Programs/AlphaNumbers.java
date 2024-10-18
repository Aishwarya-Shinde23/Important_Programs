package String_Programs;

public class AlphaNumbers {

	public static void separateAlphaAndNumeric(String input) {

		StringBuilder alpha = new StringBuilder();
		StringBuilder numeric = new StringBuilder();
		StringBuilder special = new StringBuilder();

		for (char ch : input.toCharArray()) {

			if (Character.isDigit(ch)) {
				numeric.append(ch);
			} else {
				if (Character.isLetter(ch)) {
					alpha.append(ch);
				}
				else {
					special.append(ch);
				}
			}

		}

		System.out.println("Alphabetic characters in given String : " + alpha.toString());
		System.out.println("Numeric characters in given String : " + numeric.toString());
		System.out.println("Special characters in given String : " + special.toString());
	}

	public static void main(String[] args) {

		String str = "/*+abcd-/<]{efg123456hi=-&*(j7891659460";

		separateAlphaAndNumeric(str);

	}

}
