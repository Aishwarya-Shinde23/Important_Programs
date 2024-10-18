package String_Programs;

import java.util.HashMap;

public class CharacterOccurences {

	public static void main(String[] args) {
		characterCount("This is an input string");
		
	}

	static void characterCount(String InputString) {

		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		char[] ch = InputString.toCharArray();

		for (char c : ch) {

			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);

	}

}
