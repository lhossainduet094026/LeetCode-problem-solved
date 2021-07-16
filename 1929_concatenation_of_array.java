	public static int[] getConcatenation(int[] nums) {

		int[] result = new int[nums.length * 2];

		int j = 0;
		int i = 0;
		while (j != result.length) {
			result[j] = nums[i];
			i++;
			j++;
			if (i == nums.length ) {
				i = 0;
			}
		}
		return result;
	}