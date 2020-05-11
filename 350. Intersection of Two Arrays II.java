class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer,Integer> map= new HashMap();
     List<Integer> result= new ArrayList<>();
// first count frequency of each value  of nums1
//then pick every value from nums2 .every time we get num2 and make decrease by 1 if that exist in nums1.
//because if nums2 have same value multiple time then we should pick it multiple times.
       for(int i=0;i<nums1.length;i++){
           map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
       }
       for(int i=0;i<nums2.length;i++){
           if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
               result.add(nums2[i]);
               map.put(nums2[i], map.getOrDefault(nums2[i],0)-1);
           }
       }
       //converting array list to array 
       int[] arr= new int[result.size()];
       for(int i=0;i<result.size();i++){
           arr[i]=result.get(i);
       }
        return arr;
    }
}