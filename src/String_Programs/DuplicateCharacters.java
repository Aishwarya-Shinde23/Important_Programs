package String_Programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		DuplicateCharacters("Selenium Automation Project");
	}

	static void DuplicateCharacters(String InputString) {

		char[] ch = InputString.toCharArray();

		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (charCount.containsKey(c)) {

				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}

		}
		
		Set<Character> charMap = charCount.keySet();
		
		for(char c : charMap) {
			
			if(charCount.get(c)>1) {
				System.out.println(c + " : " + charCount.get(c));
				
			}
			
		}

	}

}
