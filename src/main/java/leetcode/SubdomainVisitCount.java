package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SubdomainVisitCount {

	// Problem 811
	public List<String> subdomainVisits(String[] cpdomains) {

		Map<String, Integer> map = new HashMap<>();

		for (String str : cpdomains) {

			String[] arr = str.split(" ");

			add(map, arr[1], arr[0]);
			int index = arr[1].indexOf('.');
			int lastIndex = arr[1].lastIndexOf('.');
			add(map, arr[1].substring(index + 1), arr[0]);
			if (index != lastIndex) {
				add(map, arr[1].substring(lastIndex + 1), arr[0]);
			}
		}

		List<String> result = new ArrayList<>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			result.add(entry.getValue() + " " + entry.getKey());
		}

		return result;
	}

	private void add(Map<String, Integer> map, String str, String count) {

		if (!map.containsKey(str)) {
			map.put(str, new Integer(count));
		} else {
			map.put(str, map.get(str) + new Integer(count));
		}

	}
}
