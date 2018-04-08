package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsFromSourceToTarget {
	
	public static void main(String[] args) {
		new AllPathsFromSourceToTarget().allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}});
	}
	// Problem 797
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

		List<List<Integer>> result = new ArrayList<>();
		Queue<List<Integer>> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		list.add(0);
		queue.add(list);

		while (!queue.isEmpty()) {
			
			list = queue.poll();
			int lastElement = list.get(list.size() - 1);
			if (lastElement == graph.length - 1) {
				result.add(list);
			} else {
				for (int i = 0; i < graph[lastElement].length; i++) {
					List<Integer> newList = new ArrayList<>(list);
					newList.add(graph[lastElement][i]);
					queue.add(newList);
				}
			}
		}

		return result;
	}
}
