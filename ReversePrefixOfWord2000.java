class Solution {
    public String reversePrefix(String word, char ch) {
        boolean isSubwordReversed = false;
		String subWord = "";

		for (int i = 0; i < word.length(); i++) {
			char charOfWord = word.charAt(i);
			if (charOfWord == ch) {
				isSubwordReversed = true;
				subWord = word.substring(0, i + 1);
				subWord = reverseSubWord(subWord);
				subWord += word.substring(i + 1, word.length());
				break;
			}
		}

		return isSubwordReversed ? subWord : word;
    }
    
    private String reverseSubWord(String subWord) {
		StringBuilder sb = new StringBuilder();
		for (int i = subWord.length() - 1; i >= 0; i--) {
			sb.append(subWord.charAt(i));
		}

		return sb.toString();
	}
}
	
	
