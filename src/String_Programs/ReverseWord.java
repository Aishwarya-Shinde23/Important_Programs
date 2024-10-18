package String_Programs;

public class ReverseWord {

	public static void main(String[] args) {
		String s1 = "Welcome to Capegemini";
		String replace = "Welcome";
		String result = " ";

		String[] s = s1.split(" ");
		char[] ch = s[0].toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			result = result + ch[i];
		}

		System.out.println("Reverse word: " + s1.replaceFirst(replace, result.trim()));

	}

}
