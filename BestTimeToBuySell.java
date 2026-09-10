// Question:
//
// Given an array where each element represents the price
// of a stock on a particular day, find the maximum profit
// possible by buying once and selling once.
//
// The selling day must come after the buying day.
//
// Example:
// [7, 1, 5, 3, 6, 4]
//
// Output:
// 5
//
// Buy at 1 and sell at 6.

public class BestTimeToBuySell {

    public static int maxProfit(int[] prices) {

        int lowestPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - lowestPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit: "
                + maxProfit(prices));
    }
}
}