package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/pascals-triangle/
 */
public class No118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j > (float)i / 2){
                    subList.add(subList.get(i - j));
                    continue;
                }
                if (j == 0) {
                    subList.add(1);
                    continue;
                }
                List<Integer> preList = list.get(i - 1);
                subList.add(preList.get(j - 1) + preList.get(j));
            }
            list.add(subList);
        }
        return list;
    }
}
