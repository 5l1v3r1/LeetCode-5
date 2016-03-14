package solutions.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
public class No225 {

    Queue<Integer> p = new LinkedList<>();
    Queue<Integer> q = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> queue = q.isEmpty() ? p : q;
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue<Integer> outQueue = q.isEmpty() ? p : q;
        Queue<Integer> inQueue = q.isEmpty() ? q : p;
        while (outQueue.size() > 1) {
            Integer i = outQueue.poll();
            inQueue.add(i);
        }
        outQueue.poll();
    }

    // Get the top element.
    public int top() {
        Queue<Integer> outQueue = q.isEmpty() ? p : q;
        Queue<Integer> inQueue = q.isEmpty() ? q : p;
        Integer i = 0;
        while (!outQueue.isEmpty()) {
            i = outQueue.poll();
            inQueue.add(i);
        }
        return i;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return p.isEmpty() && q.isEmpty();
    }
}
