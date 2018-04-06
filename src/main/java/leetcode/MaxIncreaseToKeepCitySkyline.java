package leetcode;

// Problem 807
public class MaxIncreaseToKeepCitySkyline {
	public int maxIncreaseKeepingSkyline(int[][] grid) {

		int [] highestRow = new int[grid.length];
		int [] highestCol = new int[grid[0].length];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				highestRow[i] = Math.max(highestRow[i], grid[i][j]);
				highestCol[j] = Math.max(highestCol[j], grid[i][j]);
			}            
		}

		int ans = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				ans += Math.min(highestRow[i], highestCol[j]) - grid[i][j];
			}
		}

		return ans;
	}
}
