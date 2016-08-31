package leetcode.easy;

import others.structure.ListNode;

/**
 * Created by dss886 on 2016/5/15.
 */
public class No024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead, q = head.next;
        while (q != null) {
            p.next.next = q.next;
            q.next = p.next;
            p.next = q;
            if (q.next.next == null) break;
            p = p.next.next;
            q = p.next.next;
        }
        return newHead.next;
    }
}
