class Solution {
    public int repeatedNTimes(int[] A) {
         //count frequency of every element and put them into a map 
        //then check if frequency of any element is greater than or equal two .then return   that key as the result
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (frequency.containsKey(A[i])) {
                frequency.put(A[i], frequency.get(A[i]) + 1);
            } else {
                frequency.put(A[i], 1);
            }
        }
        int duplicate = 0;
        for (Map.Entry<Integer, Integer> i : frequency.entrySet()) {
            if (i.getValue() >= 2) {
                duplicate = i.getKey();
            }
        }
        return duplicate;
    }
}