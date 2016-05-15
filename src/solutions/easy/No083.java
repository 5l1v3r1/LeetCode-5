package solutions.easy;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * of course, this problem can use recursive like:
 * https://leetcode.com/discuss/37323/3-line-java-recursive-solution
 */
public class No083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
