package solutions.medium;

/**
 * Created by dss886 on 2016/3/28.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Not solved, the solution below is:
 * https://leetcode.com/discuss/18159/sharing-my-simple-and-clear-c-solution
 *
 * This solution used the Kadane's Algorithm of the max sub-array problem. See more at:
 * https://zh.wikipedia.org/wiki/%E6%9C%80%E5%A4%A7%E5%AD%90%E6%95%B0%E5%88%97%E9%97%AE%E9%A2%98
 */
public class No121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
