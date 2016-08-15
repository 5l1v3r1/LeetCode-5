package solutions.medium;

import java.util.Arrays;

/**
 * Created by dss886 on 16/8/12.
 * https://leetcode.com/problems/decode-ways/
 *
 * Time Cost: 35 min
 *
 * Key Point:
 * When reached the time cost limit, we need to pruning branches...
 */
public class No091 {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        int[] cache = new int[s.length()];
        Arrays.fill(cache, -1);
        return getDecodeNum(s, 0, cache);
    }

    private int getDecodeNum(String s, int index, int[] cache) {
        if (index == s.length()) return 1;
        if (index > s.length()) return 0;
        if (cache[index] != -1) return cache[index];
        if (s.charAt(index) == '0') {
            cache[index] = 0;
            return 0;
        }
        if (index == s.length() - 1) return 1;

        if (s.charAt(index) == '1') {
            cache[index] = getDecodeNum(s, index + 1, cache) + getDecodeNum(s, index + 2, cache);
        } else if (s.charAt(index) == '2' && s.charAt(index + 1) <= '6') {
            cache[index] = getDecodeNum(s, index + 1, cache) + getDecodeNum(s, index + 2, cache);
        } else {
            cache[index] = getDecodeNum(s, index + 1, cache);
        }

        return cache[index];
    }
}
