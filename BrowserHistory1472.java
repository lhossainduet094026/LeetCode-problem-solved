package Stacks;

import java.util.Stack;

public class BrowserHistory {

	private String current;
	private Stack backStack;
	private Stack forwardStack;

	public BrowserHistory(String homepage) {
		this.current = homepage;
		this.backStack = new Stack<>();
		this.forwardStack = new Stack<>();
	}

	public void visit(String url) {
		backStack.push(current);
		current = url;
		forwardStack.clear();
	}

	public String back(int steps) {

		while (steps > 0 && !backStack.isEmpty()) {
			forwardStack.push(current);
			String topItem = (String) backStack.pop();
			current = topItem;
			steps--;
		}

		return current;
	}

	public String forward(int steps) {

		while (steps > 0 && !forwardStack.isEmpty()) {
			backStack.push(current);
			String topItem = (String) forwardStack.pop();
			current = topItem;
			steps--;
		}

		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
