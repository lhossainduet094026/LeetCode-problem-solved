class Solution {
    public int countPrimeSetBits(int L, int R) {
         //loop from l to r
        //convert into binary
        //count number of 1 in binary
        //then find if the count is prime or not .if prime the counPrime+1
        int count = 0;
        int p = 0;
        int countPrime = 0;
        for (int i = L; i <= R; i++) {
            String binary = Integer.toBinaryString(i);
            char[] binArray = binary.toCharArray();

            for (int j = 0; j < binArray.length; j++) {
                if (binArray[j] == '1') {
                    count += 1;
                }
            }

            for (int k = 2; k <= count; k++) {
                if (count % k == 0) {
                    p = k;
                    break;
                }
            }
            if (p == count) {
                countPrime += 1;

            }
            count = 0;
        }
        return countPrime;
    }
}