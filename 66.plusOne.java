public class PlusOne66 {

	public int[] plusOne(int[] digits) {

		int carry = 0;
		int sum = 0;

		for (int i = digits.length - 1; i >= 0; i--) {

			sum = digits[i] + 1;

			if (sum == 10) {
				carry = sum / 10;
				digits[i] = sum % 10;

			} else {
				digits[i] = sum;
				return digits;
			}
		}

		if (carry == 1) {
			int[] result = new int[digits.length + 1];

			result[0] = carry;

			for (int i = 0; i < digits.length; i++) {
				result[i+1] = digits[i];
			}

			return result;
		}

		return digits;
	}

	public static void main(String[] args) {

		int[] digits = {9};

		PlusOne66 plusOne66 = new PlusOne66();
		plusOne66.plusOne(digits);

		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i]);
		}
	}
}
