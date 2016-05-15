package others.tool;

import others.stucture.ListNode;
import others.stucture.TreeNode;

import java.util.ArrayList;

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

    public static void p(TreeNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        int maxLevel = countTreeLevel(node);
        ArrayList<String> list = new ArrayList<>((int)Math.pow(2, maxLevel) - 1);
        addTree(node, list, 0, maxLevel);
    }

    private static void addTree(TreeNode node, ArrayList<String> list, int index, int maxLevel) {
        list.set(index, String.valueOf(node.val));
    }

    private static int countTreeLevel(TreeNode node) {
        if (node == null) return 0;
        return Math.max(countTreeLevel(node.left), countTreeLevel(node.right)) + 1;
    }
}
