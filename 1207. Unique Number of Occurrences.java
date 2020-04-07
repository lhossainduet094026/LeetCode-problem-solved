public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int b[]={1,2};
      boolean result = uniqueOccurrences(b);
        System.out.println(result);
    }
    public static  boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occurrences = new HashMap<>();
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            if(occurrences.containsKey(arr[i]))
            {
                occurrences.put(arr[i],occurrences.getOrDefault(arr[i],0 )+1);
            }
        else
                occurrences.put(arr[i], 1);
        //iterate over the map 
         for(Map.Entry<Integer,Integer> mapValues:occurrences.entrySet()){
             System.out.println(mapValues.getKey()+":"+mapValues.getValue());
             temp.add(mapValues.getValue());
         }
         //check if arraylist contains duplicate or not .if duplicate then result false 
         for(int i=0;i<temp.size();i++)
         {
          for(int j=i+1;j<temp.size();j++)
          {
          if(temp.get(i)==temp.get(j))
              return false ;
          }
         }
         
        return true ;
    }