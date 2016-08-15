package leetcode.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/reverse-integer/
 *
 * This solution is cheating...normal leetcode see:
 * https://leetcode.com/discuss/18785/my-accepted-15-lines-of-code-for-java
 * https://leetcode.com/discuss/38053/very-short-7-lines-and-elegant-solution
 */
public class No007 {
    public int reverse(int x) {
        String input = String.valueOf(x);
        char[] output = x < 0 ? new char[input.length() - 1] : new char[input.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = input.charAt(input.length() - i - 1);
        }
        try {
            return Integer.parseInt(String.valueOf(output)) * (x < 0 ? -1 : 1);
        } catch (NumberFormatException ignore) {}
        return 0;
    }
}
