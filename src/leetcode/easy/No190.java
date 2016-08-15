package leetcode.easy;

/**
 * Created by dss886 on 16/3/15.
 * https://leetcode.com/problems/reverse-bits/
 *
 * For optimization, we can divide an 32-bit int to 4 byte,
 * and use cache to store the result of reverse. See:
 * https://leetcode.com/discuss/27328/java-solution-and-optimization
 */
public class No190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = n & 1;
        for (int i = 0; i < 31; i++) {
            n = n >>> 1;
            result = (result << 1) + (n & 1);
        }
        return result;
    }
}