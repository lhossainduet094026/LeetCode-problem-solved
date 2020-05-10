class Solution {
    public int fib(int N) {
        
       // finacci series :0 1 1 2 3 5 8 13..................................
       //so first 2 element we can fix 
        if (N == 0||N==1) 
            return N;     
        int f0 = 0, f1 = 1, f2 = 0;

        for (int i = 2; i <= N ; i++) {	  
            f2 = f0 + f1; 
            f0=f1;
            f1=f2;
        }
        return f2;
    }
}