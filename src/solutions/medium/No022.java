package solutions.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/5/16.
 * https://leetcode.com/problems/generate-parentheses/
 */
public class No022 {

    private List<List<String>> map = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        // todo this solution is wrong.
        if (n == 0) return new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (map.size() > i) continue;
            List<String> list = new ArrayList<>();
            list.add(getDeepestParenthesis(i + 1));
            List<String> lastList = (i - 1 < 0) ? new ArrayList<>() : map.get(i - 1);
            for (String lastString : lastList) {
                list.add("(" + lastString + ")");
                list.add("()" + lastString);
            }
            map.add(list);
        }
        return map.get(map.size() - 1);
    }

    private String getDeepestParenthesis(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("(");
        }
        for (int i = 0; i < num; i++) {
            sb.append(")");
        }
        return sb.toString();
    }
}
