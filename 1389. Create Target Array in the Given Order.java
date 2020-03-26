class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
           int[] target = new int[nums.length];
        //index wise element addition and if there already then shift
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i], nums[i]);//java.util.ArrayList.add(int index, E                                                  element) method inserts the specified                                                    element E at the specified position                                                     in this list.It shifts the element                                                   currently at  that position (if any)
        }
        //converting arraylist to array
        for (int i = 0; i < nums.length; i++) {
            target[i] = arrayList.get(i);
        }
        return target;
    }
}