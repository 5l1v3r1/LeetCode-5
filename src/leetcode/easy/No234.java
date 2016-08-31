package leetcode.easy;

import others.structure.ListNode;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class No234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode p = head, q = head;
        while (q.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
        }
        if (p.next == null) return true;
        q = p.next;
        while (q != null) {
            ListNode tmp = q;
            q = q.next;
            tmp.next = p;
            p = tmp;
        }
        while (head != p) {
            if (p.next == head) return head.val == p.val;
            if (head.val != p.val) return false;
            head = head.next;
            p = p.next;
        }
        return true;
    }
}
