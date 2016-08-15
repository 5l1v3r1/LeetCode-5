package leetcode.medium;

/**
 * Created by dss886 on 16/8/12.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 *
 * This Problem is not solving, here are some good solution and thoughts:
 */
public class No309 {
    public int maxProfit(int[] prices) {
        return dpSolution(prices);
//        return smSolution(prices);
    }

    /**
     * Dynamic Programming Solution
     * Related to: https://discuss.leetcode.com/topic/30680/share-my-dp-solution-by-state-machine-thinking
     */
    private int dpSolution(int[] prices) {
        int sell = 0, prevSell = 0;
        int buy = Integer.MIN_VALUE, prevBuy;
        for (int price : prices) {
            prevBuy = buy;
            buy = Math.max(prevSell - price, prevBuy);
            prevSell = sell;
            sell = Math.max(prevBuy + price, prevSell);
        }
        return sell;
    }

    /**
     * State Machine Solution
     * Related to: https://discuss.leetcode.com/topic/30680/share-my-dp-solution-by-state-machine-thinking
     */
    private int smSolution(int[] prices) {
        int length = prices.length;
        int[] sRest = new int[length];
        int[] sBuy = new int[length];
        int[] sSell = new int[length];
        sRest[0] = 0;
        sBuy[0] = -prices[0];
        sSell[0] = Integer.MIN_VALUE;
        for (int i = 1; i < length; i++) {
            sRest[i] = Math.max(sRest[i - 1], sSell[i - 1]);
            sBuy[i] = Math.max(sBuy[i - 1], sRest[i - 1] - prices[i]);
            sSell[i] = sBuy[i - 1] + prices[i];
        }
        return Math.max(sRest[length - 1], Math.max(sBuy[length - 1], sSell[length - 1]));
    }
}
