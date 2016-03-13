package solutions.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/pascals-triangle-ii/
 *
 * This code is not elegant enough...see:
 * https://leetcode.com/discuss/15059/my-accepted-java-solution-any-better-code
 */
public class No119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            if (list.size() == 0) list.add(1);
            if (i == 1 && list.size() == 1) list.add(1);
            if (i > 1) list.add(1, list.get(0) + list.get(1));
            for (int j = 2; j < i; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
