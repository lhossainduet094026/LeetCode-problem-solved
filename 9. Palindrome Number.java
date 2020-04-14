 public boolean isPalindrome(int x) {
            int nums=x;
             int reverse=0;
             while(nums>0)
             {
                 reverse = 10*reverse+nums%10;
                 nums = nums/10;
             }
            if(reverse==x)
            {
                 return true;
            }
             else
                 return false ;  
        
    }