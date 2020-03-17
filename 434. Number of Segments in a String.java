class Solution {
    public int countSegments(String s) {
       int segment=0;
     s=s.trim();
     String[] sArray = s.split(" ");
     for(int i=0;i<sArray.length;i++)
     {
     if(!(sArray[i].equals("")))
         segment++;
     }
        return segment; 
    }
}