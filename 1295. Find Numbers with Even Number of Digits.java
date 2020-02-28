class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i:nums)
        {
           int length=String.valueOf(i).length();
        
            if(length%2==0)
            {
                count++;
            }
         }
        return count;
        }
        
    }