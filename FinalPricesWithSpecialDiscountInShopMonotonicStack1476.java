package Stacks;

import java.util.Stack;

public class FinalPricesWithSpecialDiscountInShopMonotonicStack1476 {

	public int[] finalPrices(int[] prices) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
				int index = stack.pop();
				prices[index] = prices[index] - prices[i];
			}
			stack.push(i);
		}

		return prices;
	}

	public static void main(String[] args) {

		FinalPricesWithSpecialDiscountInShopMonotonicStack1476 discountInShop1475 = new FinalPricesWithSpecialDiscountInShopMonotonicStack1476();
		int[] prices = { 8, 4, 6, 2, 3 };
		prices = discountInShop1475.finalPrices(prices);

		for (int i = 0; i < prices.length; i++) {
			System.out.print(prices[i]);
			System.out.print(" ");
		}
	}

}
