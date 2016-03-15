package solutions.easy;

import util.ListNode;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/remove-linked-list-elements/
 *
 * See recursive solution at:
 * https://leetcode.com/discuss/33043/3-line-recursive-solution
 */
public class No203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode p = head, q;
        while (p != null) {
            q = p.next;
            if (q != null && q.val == val) {
                p.next = q.next;
            } else {
                p = q;
            }
        }
        return head;
    }
}
