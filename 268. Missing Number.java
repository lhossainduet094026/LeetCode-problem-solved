class Solution {
    public int missingNumber(int[] nums) {
           int result = 0;
       int total=0;
       int sum=0; 
       total=((nums.length)*((nums.length)+1))/2;
       
       for(int i=0;i<nums.length;i++)
           sum+=nums[i];
        result=total-sum;
        return result;
    }
}