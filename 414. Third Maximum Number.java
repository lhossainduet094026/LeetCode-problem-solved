class Solution {
    public int thirdMax(int[] nums) {
       

        //pass this array in a set to remove duplicate
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < nums.length; i++) 
        {
            values.add(nums[i]);
        }
        //then we need to  sort it .
        //inserting distinct values to a plain array .because we will go to  bubble sorting approach 
        int[] inputdata = new int[values.size()];
        for (int j = 0; j < values.size(); j++) 
        {
            inputdata[j] = (int) values.toArray()[j];
        }

        //sort descending using bubble sort
        for (int i = 0; i < inputdata.length; i++) 
        {
            for (int j = i + 1; j < inputdata.length; j++) 
            {
                if (inputdata[i] < inputdata[j])
                {
                    int temp = inputdata[i];
                    inputdata[i] = inputdata[j];
                    inputdata[j] = temp;
                }
            }
        }

        //taking maximum and third maximum
        int max = inputdata[0];
       
        if (inputdata.length < 3) 
        {
            return max;
        } 
        else 
        {
             int thirdMax = inputdata[2];
            return thirdMax;
        }
    } 
}