class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int[] a={2, 15, 11, 7};
        //int target=9;
        int k=0;
        int[] temp={0,0} ;
        
        for(int i=0;i<nums.length-1;i++)
            {
                    for(int j=i+1;j<nums.length;j++)
                    {
                      if((nums[i]+nums[j])==target)
                      {
                      temp[k]=i;
                      k++;
                      temp[k]=j;
                         
                      break;
                      }
                    }
            }
     return temp;   
    }
}