package solutions.medium;

/**
 * Created by dss886 on 2016/5/24.
 * https://leetcode.com/problems/unique-paths/
 */
public class No062 {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return combinations(m + n - 2, n - 1);
    }

    /**
     * 求组合数 C(n, k)
     */
    private int combinations(int n, int k) {
        double result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (double) (k - i);
        }
        return (int) Math.round(result);
    }
}
