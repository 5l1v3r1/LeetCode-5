package solutions.easy;

import java.util.HashSet;

/**
 * Created by dss886 on 2016/3/10.
 * https://leetcode.com/problems/happy-number/
 *
 * Need to improve:
 * 1. Use n%10 to get digits, instead of String.valueOf().toCharArray().
 * 2. No need to use HashSet, see:
 *    https://leetcode.com/discuss/33349/o-1-space-java-solution?show=91379#a91379
 */
public class No202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (set.add(n)) {
            char[] chars = String.valueOf(n).toCharArray();
            n = 0;
            for (char c : chars) {
                n += Math.pow(Character.getNumericValue(c), 2);
            }
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
