class Solution {
    public int maxProduct(int[] nums) {
    //bruteforce approach
        int max = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                  int mul = (nums[i]-1)*(nums[j]-1);
                  if(mul>max)
                      max=mul;
            }
        }

        return max;
    }
}