package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	
	// Problem 804
	public int uniqueMorseRepresentations(String[] words) {

		String[] morse = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		Set<String> morseWords = new HashSet<>();

		for (int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < words[i].length(); j++) {
				sb.append(morse[words[i].charAt(j) - 'a']);
			}
			morseWords.add(sb.toString());
		}

		return morseWords.size();
	}
}
