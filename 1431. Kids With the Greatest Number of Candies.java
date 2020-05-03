class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result = new ArrayList<>();
       //find maximum cadies from the cadies array
     int max =candies[0];
       for(int i=1;i<candies.length;i++)
       { 
           if(max<=candies[i])
                 max=candies[i];
       }
       
       for(int i=0;i<candies.length;i++)
       {
            if(candies[i]+extraCandies>=max)
                result.add(Boolean.TRUE);
            else
                result.add(Boolean.FALSE);
       }
         //System.out.println(max);
         return result; 
    }
}