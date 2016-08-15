package leetcode.easy;

/**
 * Created by dss886 on 2016/5/15.
 * https://leetcode.com/problems/power-of-four/
 */
public class No342 {
    public boolean isPowerOfFour(int num) {
        return Integer.toBinaryString(num).matches("1(00)*");
    }
}
