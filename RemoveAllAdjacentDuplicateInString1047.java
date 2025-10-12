public class RemoveAllAdjacentDuplicateInString1047 {

	public String removeDuplicates(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (stack.isEmpty() || (stack.peek() != null && stack.peek() != c)) {
				stack.push(c);
			} else {
				stack.pop();
			}
		}

		return generateOutput(stack);
	}

	private String generateOutput(Stack<Character> stack) {

		StringBuilder outputString = new StringBuilder();

		for (Character character : stack) {
			outputString.append(character);
		}

		return outputString.toString();
	}

	public static void main(String[] args) {

		RemoveAllAdjacentDuplicateInString1047 rac = new RemoveAllAdjacentDuplicateInString1047();
		String input = "abbaca";
		System.out.println(rac.removeDuplicates(input));
	}

}
