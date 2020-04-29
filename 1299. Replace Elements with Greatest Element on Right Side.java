class Solution {
    public int[] replaceElements(int[] arr) {
          if(arr.length==1)
         {
            arr[arr.length-1]=-1; 
            return arr;
         }
         else
         {
           for(int i=0;i<arr.length;i++)
           {
             int singleElementChecker=arr.length-i;
             if(singleElementChecker==1)
                  {
                  arr[arr.length-2]=arr[arr.length-1];
                   break;
                   }
                int rightMax=getRightMax(i+1,arr);
                //System.out.println("right max of :"+arr[i]+" is:"+rightMax);
                arr[i]=rightMax;
            
              }
            arr[arr.length-1]=-1;
     return arr; 
         }
    }
//this method gives right maximum element of a given element
    private static int getRightMax(int i, int[] arr) {
        int max=arr[i];
      
         for(int j=i+1;j<arr.length;j++)
              {
                 if(arr[j]>max)
                  max=arr[j];
              }
        return max;
      }
    }
