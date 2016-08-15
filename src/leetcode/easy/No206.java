package leetcode.easy;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * code can be more elegant:
 * https://leetcode.com/discuss/34474/in-place-iterative-and-recursive-java-solution
 */
public class No206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head.next;
        head.next = null;
        while (p != null) {
            ListNode temp = p.next;
            p.next = head;
            head = p;
            p = temp;
        }
        return head;
    }

    private void ete() {

    }
}
