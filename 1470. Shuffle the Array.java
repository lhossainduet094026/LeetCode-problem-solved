class Solution {
    public int[] shuffle(int[] nums, int n) {
        
     int[] result = new int[nums.length];
       int k=0;
        int i=0;
       int p=nums.length/2;
       while(i<p){
       result[k++]=nums[i];
       result[k++]=nums[n++];
       i++;
       }
        return result;
    }
}