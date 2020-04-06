 public static int firstUniqChar(String s) {
         //frequency map
         Map<Character,Integer> hm = new HashMap<>();
         //first counting frequency and store into map
         for(int i=0;i<s.length();i++){
                  char c = s.charAt(i);
                 if(hm.containsKey(c))
                 {
                      hm.put(c,hm.get(c)+1);
                 }
                 else
                 {
                      hm.put(c, 1);
                 }
         }
         
         //now retrieve every character form map and check if the frequency is 1 then return its index 
         for(int j=0;j<s.length();j++)
         {
            if( hm.get(s.charAt(j))==1)
                return j;
         }
         return -1;
    }