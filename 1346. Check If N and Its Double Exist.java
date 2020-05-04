class Solution {
    public boolean checkIfExist(int[] arr) {
            for(int n=0; n<arr.length; n++)
        {
            for(int m=0; m<arr.length; m++)
            {
                if((n!=m) && arr[n] == (arr[m]*2))
                {
                    return true;
                }
            }    
        }  
        
        return false;
    }
}