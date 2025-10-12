public class BackspaceStringCompare844 {

	public boolean backspaceCompare(String s, String t) {

		s = removeBackSpaceCharacter(s);
		t = removeBackSpaceCharacter(t);

		return s.equals(t);
	}

	private String removeBackSpaceCharacter(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c != '#') {
				stack.push(c);
			} else {
				if (!stack.isEmpty()) {
					stack.pop();
				}

			}
		}

		return buildStringFromStack(stack);
	}

	private String buildStringFromStack(Stack<Character> stack) {

		StringBuilder outputString = new StringBuilder();

		for (Character character : stack) {
			outputString.append(character);
		}

		return outputString.toString();
	}

	public static void main(String[] args) {
		BackspaceStringCompare844 compare844 = new BackspaceStringCompare844();
		String input1 = "a#c";
		String input2 = "b";
		System.out.println(compare844.backspaceCompare(input1, input2));
	}

}
