package leetcode.easy;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Using recursive will cause time out, so use loop instead.
 */
public class No070 {
    public int climbStairs(int n) {
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
}
