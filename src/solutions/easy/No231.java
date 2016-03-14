package solutions.easy;

/**
 * Created by dss886 on 2016/3/12.
 * https://leetcode.com/problems/power-of-two/
 *
 * This problem can use n&(n-1) trick to make code more elegant:
 * https://leetcode.com/discuss/43875/using-n%26-n-1-trick
 */
public class No231 {
    public boolean isPowerOfTwo(int n) {
        return n >= 1 && Integer.bitCount(n) == 1;
    }
}
