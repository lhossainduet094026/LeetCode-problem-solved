  public static int uniqueMorseRepresentations(String[] words) {
    
       //map all the letters of 26 character with morse code 
       Map<Character,String> values= new HashMap<>();
    values.put('a', ".-");
       values.put('b', "-...");
       values.put('c', "-.-.");
       values.put('d', "-..");
       values.put('e', ".");
       values.put('f', "..-.");
       values.put('g', "--.");
       values.put('h', "....");
       values.put('i', "..");
       values.put('j', ".---");
       values.put('k', "-.-");
       values.put('l', ".-..");
       values.put('m', "--");
       values.put('n', "-.");
       values.put('o', "---");
       values.put('p', ".--.");
       values.put('q', "--.-");
       values.put('r', ".-.");
       values.put('s', "...");
       values.put('t', "-");
       values.put('u', "..-");
       values.put('v', "...-");
       values.put('w', ".--");
       values.put('x', "-..-");
        values.put('y', "-.--");
         values.put('z', "--..");
        
         //transformation of each String to corresponding morse code and store into set because set can store only unique value .then count those unique transformation 
        StringBuilder sb = new StringBuilder();
        Set<String> morseWords = new HashSet<>();
         for(String s:words)
         {
            // char[] sChar=s.toCharArray();
             //System.out.println(s);
             for(int i=0;i<=s.length()-1;i++)
             {
                sb.append(values.get(s.charAt(i)));
             }
               System.out.println(sb);
               morseWords.add(sb.toString());
               //System.out.println(morseWords);
               sb=new StringBuilder();
               
         }
int countDifferentTransformation = morseWords.size();
      // System.out.println(countDifferentTransformation);
       return countDifferentTransformation; 
   }