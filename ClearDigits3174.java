package Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ClearDigits3174 {

	public String clearDigits(String s) {

		Stack<Character> stack = new Stack();
		List<Character> digitList = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

		for (int index = 0; index < s.length(); index++) {
			if (!digitList.contains(s.charAt(index))) {
				stack.push(s.charAt(index));
			} else {
				stack.pop();
			}
		}

		if (stack.isEmpty())
			return "";

		return prepareStringUsingRestElements(stack);
	}

	private String prepareStringUsingRestElements(Stack<Character> stack) {

		return stack.stream().map(String::valueOf).collect(Collectors.joining());
	}

	public static void main(String[] args) {

		String input = "abc";
		ClearDigits3174 clearDigits3174 = new ClearDigits3174();
		System.out.println(clearDigits3174.clearDigits(input));
	}

}
