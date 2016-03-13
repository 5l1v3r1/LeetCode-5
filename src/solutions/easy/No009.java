package solutions.easy;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/palindrome-number/
 *
 * This solution cost 24ms, because call Math.pow(10, i) too many times.
 * Amazing solution at:
 * https://leetcode.com/discuss/23563/line-accepted-java-code-without-the-need-handling-overflow
 */
public class No009 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int level = 1, tempX = x;
        while (tempX > 9) {
            tempX = tempX / 10;
            level++;
        }

        for (int i = 0; i < level / 2; i++) {
            int m = (int) (x / Math.pow(10, i)) % 10;
            int n = (int) (x / Math.pow(10, level - i - 1)) % 10;
            if (m != n) {
                return false;
            }
        }
        return true;
    }
}
