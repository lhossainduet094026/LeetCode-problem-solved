package Stacks;

import java.util.Stack;

public class DailyTemperature739 {

	public int[] dailyTemperatures(int[] temperatures) {

		Stack<Integer> stack = new Stack();

		for (int i = 0; i < temperatures.length; i++) {

			while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				int index = stack.pop();
				temperatures[index] = i - index;
			}

			stack.push(i);
		}

		while (!stack.isEmpty()) {
			temperatures[stack.pop()] = 0;
		}

		return temperatures;
	}

	public static void main(String[] args) {

		int[] temperatures = { 30, 60, 90 };
		DailyTemperature739 dt = new DailyTemperature739();
		temperatures = dt.dailyTemperatures(temperatures);
		for (int i = 0; i < temperatures.length; i++) {
			System.out.print(temperatures[i] + " ");
		}
	}

}
