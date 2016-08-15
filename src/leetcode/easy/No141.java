package leetcode.easy;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/5/15.
 */
public class No141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode p = head, q = head.next;
        while (q != null) {
            if (q == p) return true;
            if (q.next == null) return false;
            p = p.next;
            q = q.next.next;
        }
        return false;
    }
}
