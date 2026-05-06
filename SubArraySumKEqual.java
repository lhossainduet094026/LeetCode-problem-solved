package prefixSum;

public class SubArraySumKEqual {

	public int subarraySum(int[] nums, int k) {

		int[] prefixSum = new int[nums.length];

		prefixSum[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i];
		}

		int count = 0;

	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i; j < nums.length; j++) {

	            int sum;

	            if (i == 0) {
	                sum = prefixSum[j];
	            } else {
	                sum = prefixSum[j] - prefixSum[i - 1];
	            }

	            if (sum == k) {
	                count++;
	            }
	        }
	    }

		return count;
	}

	public static void main(String[] args) {

		SubArraySumKEqual s = new SubArraySumKEqual();
		int[] nums = { 1, 2, 3 };
		int k = 3;
		int result = s.subarraySum(nums, k);
		System.out.println(result);
	}

}
