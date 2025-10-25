package Stacks;

import java.util.Stack;

public class MinStack {

	private Stack stack;
	private Stack minStack;

	public MinStack() {

		this.stack = new Stack<>();
		this.minStack = new Stack<>();
	}

	public void push(int val) {

		stack.push(val);

		if (minStack.isEmpty()) {
			minStack.push(val);
		} else {
			int top = (int) minStack.peek();

			if (val < top) {
				minStack.push(val);
			} else {
				minStack.push(top);
			}
		}

	}

	public void pop() {

		stack.pop();
		minStack.pop();
	}

	public int top() {

		return stack.isEmpty() ? -1 : (int) stack.peek();
	}

	public int getMin() {

		return (int)minStack.peek();
	}

	public static void main(String[] args) {

		int val1 = 5;
		int val2 = -2;
		int val3 = -3;

		MinStack minStack = new MinStack();

		minStack.push(val1);
		minStack.push(val2);
		minStack.push(val3);

		System.out.println("min:" + minStack.getMin());

		minStack.pop();

		System.out.println("min:" + minStack.getMin());

		System.out.println("top:" + minStack.top());

		minStack.pop();

		System.out.println("min:" + minStack.getMin());

	}
}
