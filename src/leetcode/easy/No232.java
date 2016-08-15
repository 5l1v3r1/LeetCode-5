package leetcode.easy;

import java.util.Stack;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class No232 {

    Stack<Integer> p = new Stack<>();
    Stack<Integer> q = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        q.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        balance();
        p.pop();
    }

    // Get the front element.
    public int peek() {
        balance();
        return p.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return p.isEmpty() && q.isEmpty();
    }

    private void balance() {
        if (p.isEmpty()) {
            while (!q.isEmpty()) {
                p.push(q.pop());
            }
        }
    }
}
