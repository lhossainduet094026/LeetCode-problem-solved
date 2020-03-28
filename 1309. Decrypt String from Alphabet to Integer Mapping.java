class Solution {
    public String freqAlphabets(String s) {
         Map<String, Character> values = new HashMap<>();

        //putting all the values into values map
          values.put("1", 'a');
        values.put("2", 'b');
        values.put("3", 'c');
        values.put("4", 'd');
        values.put("5", 'e');
        values.put("6", 'f');
        values.put("7", 'g');
        values.put("8", 'h');
        values.put("9", 'i');
        values.put("10#", 'j');
        values.put("11#", 'k');
        values.put("12#", 'l');
        values.put("13#", 'm');
        values.put("14#", 'n');
        values.put("15#", 'o');
        values.put("16#", 'p');
        values.put("17#", 'q');
        values.put("18#", 'r');
        values.put("19#", 's');
        values.put("20#", 't');
        values.put("21#", 'u');
        values.put("22#", 'v');
        values.put("23#", 'w');
        values.put("24#", 'x');
        values.put("25#", 'y');
        values.put("26#", 'z');
       
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                sb.append(values.get(s.substring(i - 2, i + 1)));
                i -= 2;
            } 
            else 
            {
              sb.append(values.get(String.valueOf(s.charAt(i))));
            }
        }
        return  sb.reverse().toString();
    }
}