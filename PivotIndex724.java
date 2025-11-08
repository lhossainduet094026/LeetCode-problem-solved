package prefixSum;

public class PivotIndex724 {

	public int pivotIndex(int[] nums) {
		int[] preSum = new int[nums.length];
		preSum[0] = nums[0];
		int index = -1;
		for (int i = 1; i < nums.length; i++) {
			preSum[i] = preSum[i - 1] + nums[i];
		}

		int totalSum = preSum[preSum.length - 1];
		for (int i = 0; i < preSum.length; i++) {
			int leftSum = i == 0 ? 0 : preSum[i - 1];
			int rightSum = totalSum - leftSum - nums[i];
			if (leftSum == rightSum)
				return i;
		}

		return index;
	}

	public static void main(String[] args) {

		PivotIndex724 array1480 = new PivotIndex724();
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		int index = array1480.pivotIndex(nums);

		System.out.println(index);
	}
}
