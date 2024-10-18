package String_Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Java is good programming language";

		char[] strArray = s.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}

	}

}
