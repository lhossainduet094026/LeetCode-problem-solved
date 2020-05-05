class Solution {
    public boolean hasAlternatingBits(int n) {
       //convert into binary string 
       //then iterate through the string array array if two adjacent index has same char           or not
       String bin = Integer.toBinaryString(n);
       //converting string value to character array
       char[] binArray = bin.toCharArray();
       for(int i=0;i<binArray.length-1;i++)
       {
          if(binArray[i]==binArray[i+1])
          {
           return false;
          }
       }
     return true;   
    }
}