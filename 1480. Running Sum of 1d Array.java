class Solution {
    public int[] runningSum(int[] nums) {
         int[] resultArray = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
        resultArray[i]=nums[i]+sum;
        sum=resultArray[i];
        }
        return resultArray;
    }
}