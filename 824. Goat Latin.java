class Solution {
    public String toGoatLatin(String S) {
        String[] words =S.split(" ");//breaking a line into a word array 
       List<Character> vowelList= new ArrayList<>();//arraylist to store vowel
       //lowercase vowels
       boolean flag=false;
        StringBuilder resultString = new StringBuilder();
       vowelList.add('a');
       vowelList.add('e');
       vowelList.add('i');
       vowelList.add('o');
       vowelList.add('u');
       
       //uppercase vowels
       vowelList.add('A');
       vowelList.add('E');
       vowelList.add('I');
       vowelList.add('O');
       vowelList.add('U');
       StringBuilder sbVowel = new StringBuilder();//for appending 
       //go through all word and take first letter 
       int i=1;
       StringBuilder sbConsonant=new StringBuilder(" ");
       for(String aWord:words)
       {
                   char firstLetter=aWord.charAt(0);

                  // System.out.println("first letter "+firstLetter);

                   if(vowelList.contains(firstLetter))
                   {
                           //System.out.println("vowel:"+firstLetter);
                           sbVowel.append(aWord);
                           sbVowel.append("ma");
                           //System.out.println(sb);
                           for(int j=1;j<=i;j++)
                           {
                                   sbVowel.append('a');
                                   //i++;
                           }
                           sbVowel.append(" ");
                          // System.out.println(sbVowel);
                           i++;
                           //System.out.println(i);//i represents the number of times a should concatenated 
                  flag=true;
                     resultString.append(sbVowel);
                     sbVowel=new StringBuilder();
                     //resultString.trimToSize();
                   }
                   else
                   {
                      
                          // System.out.println("cosonant:"+firstLetter);
                       //moving first character to the last of the string 
                       for(int j=1;j<aWord.length();j++)
                       {
                         sbConsonant=sbConsonant.append(aWord.charAt(j));
                       }
                       sbConsonant=sbConsonant.append(aWord.charAt(0));
                       sbConsonant.append("ma");
                       
                       for(int j=1;j<=i;j++)
                           {
                                   sbConsonant.append('a');
                                   //i++;
                           }
                       
                           sbConsonant.append(" ");
                      // System.out.println(sbConsonant);
                       i++;
                   }
                   //resultString = new StringBuilder();
    
       resultString.append(sbConsonant.toString()); 
       sbConsonant=new StringBuilder();
       }
       String outputString = resultString.toString().trim().replaceAll("[ ]{2,}", " ");//replacing two spaces with one space
    
        return outputString;
    }
}