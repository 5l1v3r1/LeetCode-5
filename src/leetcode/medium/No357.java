package leetcode.medium;

/**
 * Created by dss886 on 16/8/24.
 * https://leetcode.com/problems/count-numbers-with-unique-digits/
 *
 * This problem can also be solved by DP, but which will cost more time.
 */
public class No357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n >= 10) n = 10;
        int sum = 10;    // digit '0'
        for (int i = 2; i <= n; i++) {
            sum += 9 * combination(i - 1);      // digit '1' - '9'
        }
        return sum;
    }

    private int combination(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= (10 - i);
        }
        return sum;
    }
}
