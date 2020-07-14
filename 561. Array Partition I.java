class Solution {
    public int arrayPairSum(int[] nums) {
          //it's very easy.if we sort the array in ascending then always minimum will be the             first int  of each pairs.
          //so can add them to find the result 
        Arrays.sort(nums);
        int minSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            minSum += nums[i];
        }

        return minSum;
    }
}