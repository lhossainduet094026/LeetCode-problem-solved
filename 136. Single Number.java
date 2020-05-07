class Solution {
    public int singleNumber(int[] nums) {
        //Map all character of t frequency wise 

        //output will be that what exist in the map after iteration with frequency 1
        int b = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                b = entry.getKey();
            }
        }
        return b;
    }
}