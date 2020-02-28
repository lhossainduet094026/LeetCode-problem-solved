class Solution {
    public void reverseString(char[] s) {
        int fp = 0;
        int lp = s.length - 1;
        while (fp <= lp) {
            char temp = s[fp];
            s[fp] = s[lp];
            s[lp] = temp;
            fp += 1;
            lp -= 1;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}