package solutions.easy;

import util.ListNode;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class No019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = head;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }
        if (p == null) return q.next;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}
