class Solution {
    public int trailingZeroes(int n) {
     
         //for any natural number a number have trailing 0 if it multiplied by 10.that means we need to find complete pair of 2 & 5
         //we need to divide a number by 5 until it becomes 0
         int trailingZeroes =0;
        while(n!=0)
        {
           trailingZeroes+=n/5;
           n=n/5;
        }
        return trailingZeroes;   
    }
}