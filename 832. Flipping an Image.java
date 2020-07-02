class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
            //flipping-reverse the each row
        int[][] temp = new int[A.length][A.length];

        int i = 0, j = 0;
        for (int r = 0; r < A.length; r++) {
            for (int c = A.length - 1; c >= 0; c--) {
                temp[i][j] = A[r][c];
                j++;
            }
            i++;
            j = 0;
        }
        //invert -if value of a position is 0 then make it 1 and vice versa 
        int[][] result = new int[temp.length][temp.length];

        for (int r = 0; r < temp.length ; r++) {
            for (int c = 0; c < temp.length ; c++) {
                if (temp[r][c] == 0) {
                    result[r][c] = 1;
                } 
                else if(temp[r][c] ==1) {
                    result[r][c] = 0;
                }
            }
        }

        return result;
    }
}