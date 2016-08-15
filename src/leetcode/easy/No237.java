package leetcode.easy;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/3/5.
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class No237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
