class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
      StringBuffer sf = new StringBuffer();
        for (String s1 : words) {
                 sf.append(new StringBuffer(s1).reverse().toString()+" ");
                }
        return sf.toString().trim();
    }
}