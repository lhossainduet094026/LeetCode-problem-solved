class Solution {
    public boolean isPalindrome(String s) {
           StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' &&  s.charAt(i) <= 'Z')||(s.charAt(i)>='0' && s.charAt(i)<='9')) {
                //char c = s.charAt(i);
                sb.append(Character.toLowerCase(s.charAt(i)));
            }

        }
        String temp = sb.toString();
        if (sb.reverse().toString().equals(temp)) {
            return true;
        }
        return false;
    }
}