package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * sliding window approach
 * 
 * @author lokman 31/10/2025
 *
 */

public class FindAllAnagram438 {

	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> startIndices = new ArrayList<>();
		Map<Character, Integer> pFrequenciesMap = new HashMap<>();
		Map<Character, Integer> windowMap = new HashMap<>();
		int windowSize = p.length();

		String firstSubstring = s.substring(0, windowSize);
		calculateFrequencies(pFrequenciesMap, p);
		if (firstSubstring.length() == p.length()) {
			calculateFrequencies(windowMap, firstSubstring);
			if (windowMap.equals(pFrequenciesMap)) {
				startIndices.add(0);
			}
		}

		// Slide the window across the string
		for (int i = windowSize; i < s.length(); i++) {
			char newChar = s.charAt(i);
			char oldChar = s.charAt(i - windowSize);

			// Add new char
			windowMap.put(newChar, windowMap.getOrDefault(newChar, 0) + 1);

			// Remove old char
			if (windowMap.get(oldChar) == 1) {
				windowMap.remove(oldChar);
			} else {
				windowMap.put(oldChar, windowMap.get(oldChar) - 1);
			}

			// Compare maps
			if (windowMap.equals(pFrequenciesMap)) {
				startIndices.add(i - windowSize + 1);
			}
		}

		return startIndices;
	}

	private void calculateFrequencies(Map<Character, Integer> subStringFrequencies, String subStringOfS) {
		for (int i = 0; i < subStringOfS.length(); i++) {
			subStringFrequencies.put(subStringOfS.charAt(i),
					subStringFrequencies.getOrDefault(subStringOfS.charAt(i), 0) + 1);
		}
	}

	public static void main(String[] args) {
		FindAllAnagram438 allAnagram438 = new FindAllAnagram438();
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> result = allAnagram438.findAnagrams(s, p);
		System.out.println(result);
	}
}
