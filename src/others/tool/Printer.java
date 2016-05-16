package others.tool;

import others.stucture.ListNode;
import others.stucture.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/5/15.
 */
public class Printer {
    public static void p(int content) {
        System.out.println(content);
    }

    public static void p(String content) {
        System.out.println(content);
    }

    public static void p(List<String> content) {
        StringBuilder sb = new StringBuilder("[");
        for (String s : content) {
            sb.append("\"").append(s).append("\", ");
        }
        int l = sb.length();
        if (l > 1) sb.delete(l - 2, l);
        System.out.println(sb.append("]"));
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
