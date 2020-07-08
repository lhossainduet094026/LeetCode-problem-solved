class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
         //bubble sort to sorting the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        //find difference of two consecutive elements
        List<Integer> diff = new ArrayList<>();
        int diffenece = 0;
        for (int p = 0; p < arr.length - 1; p++) {
            diffenece = Math.abs(arr[p] - arr[p + 1]);
            diff.add(diffenece);
        }

        for (Integer i : diff) {
            if (i != diffenece) {
               return false;
            }   
        }
        return true;
    }
}