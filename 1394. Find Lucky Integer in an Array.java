class Solution {
    public int findLucky(int[] arr) {
                //find frequecy fo each value ..
      
        int result = 0;
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> tempList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
           int x=arr[i];
           if(freq.containsKey(x))
           {
              freq.put(x,freq.get(x)+1);
              
           }
           else
               freq.put(x, 1);
        }
        //then iterate over the the map .if key is same as value then add into a  arraylist for further calculation 
       for( Map.Entry<Integer,Integer> f:freq.entrySet()){
            if(f.getKey()==f.getValue())
            {
              tempList.add(f.getKey());
            }
       }
       //if no lucky integer then return -1
       if(tempList.size()<1)
           return -1;
         //if lucky integer is multiple then return max 
      else
       {
          result =  Collections.max(tempList);//Collections is the utility class of  java  to work with  collections . 
       }
        return result;
    }
}