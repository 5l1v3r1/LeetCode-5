package leetcode.medium;

/**
 * Created by dss886 on 16/8/23.
 * https://leetcode.com/problems/guess-number-higher-or-lower-ii/
 *
 * This Problem is not solving, the solution below is:
 * https://leetcode.com/problems/guess-number-higher-or-lower-ii/
 */
public class No375 {
    public int getMoneyAmount(int n) {
        return dpWithCache(new int[n + 1][n + 1], 1, n);
    }

    private int dpWithCache(int[][] cache, int start, int end) {
        if(start >= end) return 0;
        if (cache[start][end] != 0) return cache[start][end];
        int result = Integer.MAX_VALUE;
        for (int x = start; x <= end; x++) {
            int tmp = x + Math.max(dpWithCache(cache, start, x - 1), dpWithCache(cache, x + 1, end));
            result = Math.min(result, tmp);
        }
        cache[start][end] = result;
        return result;
    }
}
