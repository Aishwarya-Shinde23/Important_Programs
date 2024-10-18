package String_Programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		DuplicateWords("Selenium Java Automation Test Program Project using Java Program Language ");

	}

	public static void DuplicateWords(String InputString) {

		// 1. Split the String using spaces
		String[] words = InputString.split(" ");

		// 2. Create a HashMap to store these words in <KEY, VALUE> format
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

		// 3. Iterate each word from wordCount
		for (String word : words) {

			// 4. Check if word is present in wordCount/ not
			if (wordCount.containsKey(word.toLowerCase())) {

				// 5. If it is present, then add the value for the key=word
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
			} else {
				// 6. If is it not present, add the word & set it's value to 1
				wordCount.put(word.toLowerCase(), 1);
			}

		}

		// 7. Get Key for each word
		Set<String> wordsInString = wordCount.keySet();

		// 8. Iterate each word from wordsInString
		for (String word : wordsInString) {
			
			// 9.Check if wordCount is greater than 1
			if (wordCount.get(word) > 1) {
				
				// 10. To get only duplicate values
				System.out.println(word + " : " + wordCount.get(word));
			}
		}

	}

}
