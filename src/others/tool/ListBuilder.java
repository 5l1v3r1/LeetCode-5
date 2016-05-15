package others.tool;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/5/15.
 */
public class ListBuilder {
    public static ListNode get(int[] list) {
        if (list == null || list.length == 0) return null;
        ListNode head = new ListNode(list[0]);
        ListNode lastNode = head;
        for (int i = 1; i < list.length; i++) {
            ListNode node = new ListNode(list[i]);
            lastNode.next = node;
            lastNode = node;
        }
        return head;
    }
}
