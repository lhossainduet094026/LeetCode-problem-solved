class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> processdList = new ArrayList<>();
        //if value of specific index of the array is divisible by 2 then add all even              number 
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                processdList.add(A[i]);
            }

        }
        //addding rest of the odd number of the given array 
        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 != 0) {
                processdList.add(A[k]);

            }
        }
       //converting list to array
        int[] finalResult = new int[processdList.size()];
        for (int j = 0; j < processdList.size(); j++) {
            finalResult[j] = processdList.get(j).intValue();
        }
        return finalResult; 
    }
}