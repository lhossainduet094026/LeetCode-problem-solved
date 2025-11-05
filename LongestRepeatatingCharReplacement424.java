package slidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author lokman 5/11/25
 *
 */
public class LongestRepeatatingCharReplacement424 {

	public int characterReplacement(String s, int k) {

		int start = 0, maxlen = 0, windowSize = 0, maxCount = 0;

		Map<Character, Integer> frequencyMap = new HashMap<>();

		for (int end = 0; end < s.length(); end++) {
			char letter = s.charAt(end);
			frequencyMap.put(letter, frequencyMap.getOrDefault(letter, 0) + 1);
			maxCount = Math.max(maxCount, frequencyMap.get(letter));
			windowSize = end - start + 1;
			if (windowSize - maxCount > k) {
				frequencyMap.put(s.charAt(start), frequencyMap.getOrDefault(s.charAt(start), 0) - 1);
				start += 1;
				windowSize = end - start + 1;
			}

			maxlen = Math.max(maxlen, windowSize);
		}

		return maxlen;
	}

	public static void main(String[] args) {

		String s = "AABABBA";
		int k = 1;

		LongestRepeatatingCharReplacement424 charReplacement424 = new LongestRepeatatingCharReplacement424();
		System.out.println(charReplacement424.characterReplacement(s, k));
	}

}
