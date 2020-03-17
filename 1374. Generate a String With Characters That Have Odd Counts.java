class Solution {
    public String generateTheString(int n) {
       char[] c =new char[n]; //returned string will 4 character length
         
        Arrays.fill(c, 'a');//fill up the char array with-'a'
         if(n%2==0)
         {
         c[0]='b';//if a in even number of times in the array then make it odd
         }
         String result = new String(c);//converting character array into string to                                                            return it .
        return result; 
    }
}