class Solution {
    public int balancedStringSplit(String s) {
         char[] letter = s.toCharArray();
        int lCounter = 0;
        int rCounter = 0;
        int matchCounter = 0;
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 'L') {
                lCounter += 1;
            }
            if (letter[i] == 'R') {
                rCounter += 1;
            }
            if (lCounter == rCounter) {
                matchCounter += 1;
            }
        }
        return matchCounter;
    }
}