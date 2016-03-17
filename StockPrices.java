import java.lang.Math;

public class StockPrices {

	public static void main(String args[]) {

		StockPrices sp = new StockPrices();
		int[] stock_prices_yesterday = {10};

		sp.get_max_profit(stock_prices_yesterday);

	}

	public int get_max_profit(int stocks[]) {
		
		if(stocks.length < 2) {
			throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		}


		int minPrice = stocks[0];
		int maxProfit = stocks[1] - stocks[0];

		for (int i = 1; i < stocks.length; i++) {
			int currentPrice = stocks[i];
			int potentialProfit = currentPrice - minPrice;

			maxProfit = Math.max(maxProfit, potentialProfit);
			minPrice = Math.min(minPrice, currentPrice);
		}

		System.out.println("Max Profit = "+maxProfit);
		return maxProfit;
	}

}