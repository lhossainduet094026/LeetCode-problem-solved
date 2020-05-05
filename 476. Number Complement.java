class Solution {
    public int findComplement(int num) {
      String bin = Integer.toBinaryString(num);
       char[] binPresentation = bin.toCharArray();
       //fliping characters 
       for(int i=0;i<binPresentation.length;i++)
       {
             if(binPresentation[i]=='0')
                 binPresentation[i]='1';
             else if (  binPresentation[i]=='1')
                       binPresentation[i]='0';      
       }
       //character array to string conversion
         String s = new String(String.valueOf(binPresentation));
         System.out.println(s);
         int decimal=Integer.parseInt(s,2);
    
         return decimal;   
    }
}