package solutions.easy;

import util.ListNode;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 *
 * Not solved, the solution below is:
 * https://leetcode.com/discuss/66203/java-solution-without-knowing-the-difference-in-len
 */
public class No160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode p = headA, q = headB;
        // this loop will be endless when the two links has no intersection
//        while (p != q) {
//            p = p.next == null ? headB : p.next;
//            q = q.next == null ? headA : q.next;
//        }
        // Add an 'null' node in the loop avoid endless
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }
}
