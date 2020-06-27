class Solution {
    public int xorOperation(int n, int start) {
           int xor = 0;
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = start + 2 * i;
        }
        for (int i = 0; i < ar.length; i++) {

            xor = ar[i] ^ xor;
        }
        return xor;
    }
}