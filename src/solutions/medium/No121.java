package solutions.medium;

/**
 * Created by dss886 on 2016/3/28.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class No121 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0], max = prices[prices.length - 1];
        for (int i = 1, j = prices.length - 2; i < prices.length - 1 && i <= j; i++, j--) {
            if (prices[i] < min) min = prices[i];
            if (prices[j] > max) max = prices[j];

        }
        return Math.max(max - min, 0);
    }
}
