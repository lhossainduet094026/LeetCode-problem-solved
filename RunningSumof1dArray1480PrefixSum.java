package slidingWindow;

public class RunningSumof1dArray1480 {

	public int[] runningSum(int[] nums) {
		int[] preSum = new int[nums.length];
		preSum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			preSum[i] = preSum[i - 1] + nums[i];
		}

		return preSum;
	}

	public static void main(String[] args) {

		RunningSumof1dArray1480 array1480 = new RunningSumof1dArray1480();
		int[] nums = { 1, 2, 3, 4 };
		nums = array1480.runningSum(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
