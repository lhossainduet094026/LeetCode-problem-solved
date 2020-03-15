class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] > nums[j]) {
                        count += 1;
                    }
                }
            }
            resultList.add(count);
            count=0;
        }
        int[] a = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i) != null) {
                a[i] = resultList.get(i);
            }

          
        }
      return a;
    }
}