class Solution {
    public int maximumProduct(int[] nums) {
         //In a ascending sorted array the multiplication of last 3 element will produce                 maximum result.
         Arrays.sort(nums);
         int length = nums.length;
         if(length==3){
             //if length==3 and first 2 element is negative then we multiplication of first 2              element will result 
             
         return nums[length-3]*nums[length-2]*nums[length-1];
         }
         else{
             return Math.max(nums[length-3]*nums[length-2]*nums[length-1],                                          nums[0]*nums[1]*nums[length-1]);
             
    }
}
}