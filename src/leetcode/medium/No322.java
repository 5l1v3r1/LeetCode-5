package leetcode.medium;

/**
 * Created by dss886 on 16/8/30.
 * https://leetcode.com/problems/coin-change/
 *
 * My Solution using both amount and maxIndex can hardly use cache array,
 * (which using int[amount + 1][maxIndex +1] will have low shooting rate)
 *
 * The solution below removed the maxIndex, and search the whole array every time to avoid use maxIndex.
 * Then the cache array can shrinkage to the int[amount + 1].
 */
public class No322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins == null || coins.length == 0) return -1;
        int[] cache = new int[amount + 1];
        return coinChangeHelper(coins, cache, amount);
    }

    private int coinChangeHelper(int[] coins, int[] cache, int amount) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (cache[amount] != 0) return cache[amount];
        int minAmount = Integer.MAX_VALUE;
        for(int coin : coins) {
            int result = coinChangeHelper(coins, cache, amount - coin);
            if (result >= 0 && result + 1 < minAmount) {
                minAmount = result + 1;
            }
        }
        cache[amount] = (minAmount == Integer.MAX_VALUE) ? -1 : minAmount;
        return cache[amount];
    }
}
