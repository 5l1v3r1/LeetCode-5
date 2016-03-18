package solutions.easy;

import java.util.Stack;

/**
 * Created by dss886 on 2016/3/17.
 * https://leetcode.com/problems/min-stack/
 *
 * Not solved, inspired by:
 * https://leetcode.com/discuss/15679/share-my-java-solution-with-only-one-stack
 *
 * The idea is to store the gap between the min value and the current value,
 * instead of storing the current value directly.
 */
public class No155 {

    Stack<Long> stack = new Stack<>();
    long min;

    public void push(int x) {
        if (stack.isEmpty()) {
            min = x;
        }
        stack.push(x - min);
        if (x < min) min = x;
    }

    public void pop() {
        min = stack.peek() < 0 ? min - stack.peek() : min;
        stack.pop();
    }

    public int top() {
        return (int) (stack.peek() < 0 ? min : min + stack.peek());
    }

    public int getMin() {
        return (int)min;
    }
}
