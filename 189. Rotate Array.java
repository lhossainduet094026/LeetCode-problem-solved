class Solution {
    public void rotate(int[] nums, int k) {
        //bruteforce approach 
        int j = 0;
        while (k > 0) {
            int temp = nums[nums.length - 1];
            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
            k--;
        }
    }
}