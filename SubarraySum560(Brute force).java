package slidingWindow;

public class SubarraySum560 {

	public int subarraySum(int[] nums, int k) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					count = count + 1;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1,1,1 };
		int k = 2;

		SubarraySum560 ss = new SubarraySum560();
		System.out.println(ss.subarraySum(nums, k));
	}

}
