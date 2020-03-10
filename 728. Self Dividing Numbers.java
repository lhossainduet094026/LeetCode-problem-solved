class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
  List<Integer> lst = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10) {
                lst.add(i);
                continue;
            }
            String checkLast0 = String.valueOf(i);//11
            char[] ar = checkLast0.toCharArray();
           // if (!(ar[ar.length - 1] == '0')) {
                for (int j = 0; j < ar.length; j++) {
                    if(ar[j]!='0'){
                    int temp = Character.getNumericValue(ar[j]);
                    if (i % temp == 0) {
                        ar[j] = 't';//todo:need to fix the bugs 

                    } else {
                        ar[j] = 'f';
                    }
                }
                }
                int trueCounter = 0;
                for (int k = 0; k < ar.length; k++) {
                    if (ar[k] == 't') {
                        trueCounter += 1;
                    }
                }
                if (ar.length == trueCounter) {
                    lst.add(i);
                }
            }
     //   }
        return lst;
    }
}