package leetcode.easy;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class No328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode p = head, q = head.next;
        while (q != null && q.next != null) {
            ListNode m = p.next, n = q.next;
            p.next = n;
            q.next = n.next;
            n.next = m;
            p = p.next;
            q = q.next;
        }
        return head;
    }
}
