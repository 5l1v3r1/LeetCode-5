package solutions.easy;

import java.util.Stack;

/**
 * Created by dss886 on 2016/3/17.
 * https://leetcode.com/problems/min-stack/
 */
public class No155 {

    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        if (x < min) min = x;
        stack.push(x);
    }

    public void pop() {

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
