package leetcode.easy;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Classic DP problem, using bottom-up loop or up-bottom recursive with cache.
 */
public class No070 {
    public int climbStairs(int n) {
        return dpLoop(n);
//        return dpRecursive(n, new int[n + 1]);
    }

    private int dpLoop(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int p = 1;
        int q = 2;
        for (int i = 3; i <= n; i++) {
            int temp = p + q;
            p = q;
            q = temp;
        }
        return q;
    }

    private int dpRecursive(int n, int[] cache) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (cache[n] != 0) return cache[n];
        cache[n] = dpRecursive(n - 1, cache) + dpRecursive(n - 2, cache);
        return cache[n];
    }
}
