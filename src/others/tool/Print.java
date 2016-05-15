package others.tool;

import others.stucture.ListNode;

/**
 * Created by dss886 on 2016/5/15.
 */
public class Print {
    public static void p(String content) {
        System.out.println(content);
    }

    public static void p(ListNode node) {
        StringBuilder sb = new StringBuilder();
        if (node == null) {
            sb.append("null");
        } else {
            while (node != null) {
                sb.append(node.val);
                if (node.next != null) sb.append("->");
                node = node.next;
            }
        }
        System.out.println(sb.toString());
    }
}
