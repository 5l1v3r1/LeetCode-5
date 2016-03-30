package solutions.medium;

/**
 * Created by dss886 on 2016/3/30.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class No122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
