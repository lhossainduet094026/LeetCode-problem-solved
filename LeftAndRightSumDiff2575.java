package prefixSum;

public class LeftAndRightSumDiff2575 {

	public int[] leftRightDifference(int[] nums) {

		int[] result = new int[nums.length];

		int[] left = new int[nums.length];
		int[] right = new int[nums.length];

		left[0] = 0;

		int sum = 0;
		// calculating left of each element
		for (int i = 1; i < nums.length; i++) {
			sum = sum + nums[i - 1];
			left[i] = sum;
		}

		// calculating right of each element
		sum = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			right[i] = sum;
			sum = nums[i] + sum;
		}

		// calculating differences
		for (int i = 0; i < nums.length; i++) {
			result[i] = Math.abs(left[i] - right[i]);
		}

		return result;

	}

	public static void main(String[] args) {

		int[] nums = { 2, 3, 5, 1 };
		LeftAndRightSumDiff2575 leftAndRightSumDiff2575 = new LeftAndRightSumDiff2575();
		nums = leftAndRightSumDiff2575.leftRightDifference(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
