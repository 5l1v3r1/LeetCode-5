package solutions.easy;

import java.util.Stack;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/valid-parentheses/
 */
public class No020 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) return false;
            char popChar = stack.pop();
            if (c - popChar != 1 && c - popChar != 2) return false;
        }
        return stack.isEmpty();
    }
}
