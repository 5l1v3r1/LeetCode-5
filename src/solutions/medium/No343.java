package solutions.medium;

/**
 * Created by dss886 on 2016/5/15.
 * https://leetcode.com/problems/integer-break/
 */
public class No343 {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        int a = n/3;
        int b = n - a * 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        } else if (b == 1) {
            return (int) (Math.pow(3, a - 1) * (3 + b));
        } else {
            return (int) (Math.pow(3, a) * b);
        }
    }
}
