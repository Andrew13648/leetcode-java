package leetcode;

// Problem 557
public class ReverseWordsInAStringIII {

	public String reverseWords(String s) {

		String[] arr = s.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {

			result.append(new StringBuilder(arr[i]).reverse());
			if (i + 1 < arr.length) {
				result.append(' ');
			}
		}

		return result.toString();
	}
}
