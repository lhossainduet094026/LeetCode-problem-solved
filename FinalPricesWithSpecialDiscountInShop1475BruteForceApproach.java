package Stacks;

public class FinalPricesWithSpecialDiscountInShop1475 {

	public int[] finalPrices(int[] prices) {
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {

				if (prices[j] <= prices[i]) {
					prices[i] = prices[i] - prices[j];
					break;
				}
			}
		}

		return prices;
	}

	public static void main(String[] args) {

		FinalPricesWithSpecialDiscountInShop1475 discountInShop1475 = new FinalPricesWithSpecialDiscountInShop1475();
		int[] prices = {10,1,1,6};
		prices = discountInShop1475.finalPrices(prices);

		for (int i = 0; i < prices.length; i++) {
			System.out.print(prices[i]);
			System.out.print(" ");
		}
	}

}
