class Solution {
    public int hammingDistance(int x, int y) {
           
    String binXor =Integer.toBinaryString((x & (~y)) | ((~x )& y));
   
     int distance=0;
     for(int i=0;i<binXor.length();i++)
     {
       if(binXor.charAt(i)=='1')
       {
         distance+=1;
       }
     
     }
     return distance;   
    }
}