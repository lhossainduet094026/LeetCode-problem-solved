package Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI496 {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {

		Stack<Integer> stack = new Stack();
		Map<Integer, Integer> nextGreaterElementMap = new HashMap<>();

		for (int i = 0; i < nums2.length; i++) {
			while (!stack.isEmpty() && stack.peek() < nums2[i]) {
				nextGreaterElementMap.put(stack.pop(), nums2[i]);
			}

			stack.push(nums2[i]);
		}

		while (!stack.isEmpty()) {
			nextGreaterElementMap.put(stack.pop(), -1);
		}

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = nextGreaterElementMap.get(nums1[i]);
		}

		return nums1;
	}

	public static void main(String[] args) {

		NextGreaterElementI496 ng = new NextGreaterElementI496();
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };

		nums1 = ng.nextGreaterElement(nums1, nums2);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

}
