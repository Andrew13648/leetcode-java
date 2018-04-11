package leetcode;

// Problem 806
public class NumberOfLinesToWriteString {

	public int[] numberOfLines(int[] widths, String S) {

		int lines = 1;
		int length = 0;

		for (int i = 0; i < S.length(); i++) {

			if (length + widths[S.charAt(i) - 'a'] > 100) {
				length = 0;
				lines++;
			}

			length += widths[S.charAt(i) - 'a'];
		}

		return new int[] { lines, length };
	}

}
