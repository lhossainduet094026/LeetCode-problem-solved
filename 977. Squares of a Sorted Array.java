class Solution {
    public int[] sortedSquares(int[] A) {
          //making of each element of the array 
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        //sorting the array 
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }

            }
        }
        return A;
    }
}