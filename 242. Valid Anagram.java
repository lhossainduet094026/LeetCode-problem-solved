class Solution {
    public boolean isAnagram(String s, String t) {
        //my target is to calculate frequency table first .then pic every character from t and if it exists in frequency table then decrement by 1 .if it becomes 0 then delete it from table.
//if there exist any character in the table then it will not anargram .
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer>  frequency = new HashMap<>();
        //making a frequency map
        for(int i=0;i<s.length();i++)
        {
           if(frequency.containsKey(s.charAt(i)))
           
                 frequency.put(s.charAt(i),frequency.get(s.charAt(i))+1);
           else 
                 frequency.put(s.charAt(i),1);
        }
         //pick every character from t    
         for(int j=0;j<t.length();j++)
         {
            if(frequency.containsKey(t.charAt(j)))
            {
                frequency.put(t.charAt(j), frequency.get(t.charAt(j))-1);
                    if(frequency.get(t.charAt(j))==0)
                         frequency.remove(t.charAt(j));
            }
            else
                return false;
           
        }
        return true;
    }
}