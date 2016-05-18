package solutions.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/5/16.
 * https://leetcode.com/problems/generate-parentheses/
 *
 * This problem is not solved, the solution below is:
 * https://leetcode.com/discuss/14436/concise-recursive-c-solution
 */
public class No022 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        addString(list, "", n, 0);
        return list;
    }

    private void addString(List<String> list, String current, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(current);
            return;
        }
        if (left > 0) addString(list, current + "(", left - 1, right + 1);
        if (right > 0) addString(list, current + ")", left, right - 1);
    }
}
