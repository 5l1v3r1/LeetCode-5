package leetcode.medium;

/**
 * Created by dss886 on 2016/3/24.
 * https://leetcode.com/problems/single-number/
 *
 * Not solved, the solution below is:
 * https://leetcode.com/discuss/6170/my-o-n-solution-using-xor
 *
 * Using xor...so brilliant.
 */
public class No136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
