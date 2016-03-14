package solutions.easy;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/power-of-three/
 *
 * There are some interesting cheating solution:
 * https://leetcode.com/discuss/78532/summary-all-solutions-new-method-included-at-15-30pm-jan-8th
 */
public class No326 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && n == Math.pow(3, Math.round(Math.log(n) / Math.log(3)));
    }
}
