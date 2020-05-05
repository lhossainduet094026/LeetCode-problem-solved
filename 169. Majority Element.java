class Solution {
    public int majorityElement(int[] nums) {
         Map<Integer, Integer> freq = new HashMap<>();
        //my target is to count the frequency of every elment 
        for (Integer i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        //then check  if freqency of a value>n/2
        // System.out.println(freq);
        int arrayLength = nums.length;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > arrayLength / 2) {
                result = key;
            }
        }
        return result;
    }
}