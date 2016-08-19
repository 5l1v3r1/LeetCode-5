package leetcode.medium;

/**
 * Created by dss886 on 16/8/19.
 * https://leetcode.com/problems/perfect-squares/
 *
 * DP solution cost too much in this problem (341ms),
 * other thoughts like BFS or mathematics may do it better. See:
 * https://discuss.leetcode.com/topic/24255/summary-of-4-different-solutions-bfs-dp-static-dp-and-mathematics
 *
 * Even if we are using DP, this solution can be more better.
 * Searching from large to small create too much branches (using an int[][] to cache the middle result),
 * search it from small to large will have less branches and more efficient.
 */
public class No279 {
    public int numSquares(int n) {
        int sqr = (int) Math.sqrt(n);
        int[][] cache = new int[n + 1][sqr + 1];
        return getSquareNumWithCache(n, cache, sqr);
    }

    private int getSquareNumWithCache(int n, int[][] cache, int maxSqr) {
        if (cache[n][maxSqr] != 0) return cache[n][maxSqr];
        if (maxSqr == 1)  return n;
        int remainNum = n - maxSqr * maxSqr;
        if (remainNum == 0) return 1;
        if (remainNum < 0) return getSquareNumWithCache(n, cache, maxSqr - 1);
        int containThis = 1 + getSquareNumWithCache(remainNum, cache, maxSqr);
        int notContainThis = getSquareNumWithCache(n, cache, maxSqr - 1);
        cache[n][maxSqr] = Math.min(containThis, notContainThis);
        return cache[n][maxSqr];
    }
}
