package leetcode.easy;

/**
 * Created by dss886 on 2016/3/7.
 * https://leetcode.com/problems/excel-sheet-column-number/
 *
 * After seeing discuss:
 * 1. no need to call s.toCharArray(), using s.getCharAt() directly.
 * 2. let sum *= 26 in each circle (replacing Math.pow()), will reduce running time.
 * See: https://leetcode.com/discuss/84977/my-2ms-java-solution
 */
public class No117 {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // ASCII: A-65, a-97
            sum += (chars[i] - 64) * Math.pow(26, chars.length - i - 1);
        }
        return sum;
    }
}
