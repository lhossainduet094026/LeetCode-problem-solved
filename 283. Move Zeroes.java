class Solution {
    public void moveZeroes(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j]!= 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
          for (int k = 0; k < nums.length; k++) {
              System.out.println(nums[k]);
          } 
    }
}