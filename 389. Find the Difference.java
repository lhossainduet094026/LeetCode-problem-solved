class Solution {
    public char findTheDifference(String s, String t) {
          //Map all character of t frequency wise 
        //then try to find characters  s into  t .if found then delete one until that              gets 0.
        //output will be that what exist in the map after iteration 
        char result = ' ';
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            }
            else   frequency.put(c, 1);
        }
        for (int j = 0; j < s.length(); j++) {
            char ct = s.charAt(j);
            if (frequency.containsKey(ct)) {
                frequency.put(ct, frequency.get(ct) - 1);
             if(frequency.get(ct)==0)
             {
                frequency.remove(ct);
             }
            }
            
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            result = entry.getKey();
        }
        return result;
    }
}