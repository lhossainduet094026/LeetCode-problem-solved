package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagram438 {

	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> startIndices = new ArrayList<>();

		int lengthOfP = p.length();

		for (int i = 0; i < s.length(); i++) {

			if(lengthOfP + i > s.length())
				return startIndices;
			
			String subStringOfS = s.substring(i, lengthOfP + i);

			boolean isAnagram = checkIfAnagram(subStringOfS, p);

			if (isAnagram) {
				startIndices.add(i);
			}
		}

		return startIndices;
	}

	private boolean checkIfAnagram(String subStringOfS, String p) {

		Map<Character, Integer> subStringFrequencies = new HashMap<>();
		Map<Character, Integer> pFrequencies = new HashMap<>();

		// 1. check length
		if (subStringOfS.length() != p.length()) {
			return false;
		}

		// 2. check for each letter and same frequencies
		calculateFrequencies(subStringFrequencies, subStringOfS);
		calculateFrequencies(pFrequencies, p);

		return subStringFrequencies.equals(pFrequencies);
	}

	private void calculateFrequencies(Map<Character, Integer> subStringFrequencies, String subStringOfS) {

		for (int i = 0; i < subStringOfS.length(); i++) {
			subStringFrequencies.put(subStringOfS.charAt(i), subStringFrequencies.getOrDefault(subStringOfS.charAt(i), 0) + 1);
		}
	}

	public static void main(String[] args) {

		FindAllAnagram438 allAnagram438 = new FindAllAnagram438();
		String s = "abab";
		String p = "ab";

		List<Integer> result = allAnagram438.findAnagrams(s, p);
		System.out.println(result);
	}

}
