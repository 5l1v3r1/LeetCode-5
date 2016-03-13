package solutions.easy;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 *
 * One line solution at:
 * https://leetcode.com/discuss/19855/my-one-line-solutions-in-3-languages
 */
public class No172 {
    public int trailingZeroes(int n) {
        int nums = (int) (Math.log(n) / Math.log(5));
        int sum = 0;
        for (int i = 0; i < nums; i++) {
            sum += n / Math.pow(5, i + 1);
        }
        return sum;
    }
}
