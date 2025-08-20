class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

		int closest = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {

				int total = nums[i] + nums[left] + nums[right];

				if (Math.abs(total - target) < Math.abs(closest - target)) {
					closest = total;
				}

				if (total < target) {
					left += 1;
				} else if (total > target) {
					right -= 1;
				}

				if (target == closest) {
					return total;
				}

			}
		}

		return closest;
    }
}
