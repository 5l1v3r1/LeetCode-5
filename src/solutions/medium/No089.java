package solutions.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/5/20.
 * https://leetcode.com/problems/gray-code/
 *
 * This solution is too slow (10ms when most are 1ms). More elegant solution at:
 * https://leetcode.com/discuss/24634/an-accepted-three-line-solution-in-java
 */
public class No089 {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (int) Math.pow(2, n); i++) {
            int result = 0;
            for (int j = n - 1; j >= 0; j--) {
                result += getDigit(i, j);
                if (j != 0) result = result << 1;
            }
            list.add(result);
        }
        return list;
    }

    private int getDigit(int i, int position) {
        int start = (int) Math.pow(2, position);
        int end = start * 3;
        i = i % (start + end);
        return i >= start && i < end ? 1 : 0;
    }
}
