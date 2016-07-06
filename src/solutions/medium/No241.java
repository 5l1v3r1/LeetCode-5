package solutions.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dss886 on 16/7/5.
 * https://leetcode.com/problems/different-ways-to-add-parentheses/
 *
 * Problem is not solved, the solution below is:
 * https://discuss.leetcode.com/topic/19901/a-recursive-java-solution-284-ms
 *
 * No enough comprehend of Recursion!
 */
public class No241 {

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i + 1);
                List<Integer> leftResult = diffWaysToCompute(left);
                List<Integer> rightResult = diffWaysToCompute(right);
                for (Integer l :   leftResult) {
                    for (Integer r :   rightResult) {
                        int count = 0;
                        switch (input.charAt(i)) {
                            case '+': count = l + r;
                                break;
                            case '-': count = l - r;
                                break;
                            case '*': count = l * r;
                                break;
                        }
                        result.add(count);
                    }
                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.valueOf(input));
        }
        return result;
    }
}
