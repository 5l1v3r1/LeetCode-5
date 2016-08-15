package leetcode.easy;

/**
 * Created by dss886 on 2016/3/12.
 * https://leetcode.com/problems/number-of-1-bits/
 *
 * Judge (n != 0) in while loop, because when input unsigned num is 2147483648, n will be -1.
 * Also Integer.bitCount() will count the hammingWeight directly.
 */
public class No191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            n = n >>> 1;
        }
        return sum;
    }
}
