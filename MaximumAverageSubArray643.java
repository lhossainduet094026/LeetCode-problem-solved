package array;

public class MaximumAverageSubArray643 {

	public double findMaxAverage(int[] nums, int k) {

		if (nums.length == 1 && k == 1) {
			return nums[0];
		}

		double maxAverage = 0.0;
		int currentSum = 0;

		// compute sum of first k element

		for (int i = 0; i < k; i++) {
			currentSum = currentSum + nums[i];
		}

		maxAverage = (double) currentSum / k;

		// now slide the window
		for (int i = k; i < nums.length; i++) {
			currentSum = (currentSum + nums[i]) - nums[i - k];
			maxAverage = Math.max(maxAverage, (double) currentSum / k);
		}

		return maxAverage;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;

		MaximumAverageSubArray643 mav = new MaximumAverageSubArray643();
		System.out.println(mav.findMaxAverage(nums, k));
	}

}
