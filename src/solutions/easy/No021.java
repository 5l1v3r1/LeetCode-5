package solutions.easy;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/3/12.
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Recursive solution at:
 * https://leetcode.com/discuss/8372/a-recursive-solution
 */
public class No021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head, tail;
        if (l1.val < l2.val) {
            head = l1;
            tail = l1;
            l1 = l1.next;
        } else {
            head = l2;
            tail = l2;
            l2 = l2.next;
        }
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }
            if (l1.val < l2.val) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        return head;
    }
}
