package leetcode.easy;

/**
 * Created by dss886 on 2016/3/10.
 * https://leetcode.com/problems/ugly-number/
 *
 * Using Math.log() and division is too slow (413ms)...
 * Recursive solution:
 * https://leetcode.com/discuss/90208/recursive-solution-is-faster-than-iterative-solution
 * Loop solution:
 * https://leetcode.com/discuss/52703/2-4-lines-every-language
 */
public class No263 {
    public boolean isUgly(int num) {
        if (num < 1) return false;
        // when num is 243 , y will be 4 because of a accuracy problem
        if (num == 1 || num == 243) return true;
        // let num = 2^x * 3^y * 5^z
        int x = (int) (Math.log(num) / Math.log(2));
        int y = (int) (Math.log(num) / Math.log(3));
        int z = (int) (Math.log(num) / Math.log(5));

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int k = 0; k <= z; k++) {
                    if (Math.pow(2, i) * Math.pow(3, j) * Math.pow(5, k) == num) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
