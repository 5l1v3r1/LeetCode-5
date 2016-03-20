package solutions.medium;

/**
 * Created by dss886 on 2016/3/20.
 * https://leetcode.com/problems/counting-bits/
 */
public class No338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            if (i / factor >= 2) factor *= 2;
            result[i] = result[i - factor] + 1;
        }
        return result;
    }
}
