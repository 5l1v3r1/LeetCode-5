package others.tool;

import others.structure.ListNode;
import others.structure.TreeNode;

/**
 * Created by dss886 on 2016/5/15.
 */
public class Parser {
    /**
     *  Example input: "[1, 2, 3, 4]"
     */
    public static ListNode list(String list) {
        if (list == null || list.isEmpty()) return null;
        list = list.replaceAll("[\\[\\] ]", "");
        String[] nums = list.split(",");
        ListNode head = new ListNode(Integer.parseInt(nums[0]));
        ListNode lastNode = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode node = new ListNode(Integer.parseInt(nums[i]));
            lastNode.next = node;
            lastNode = node;
        }
        return head;
    }

    /**
     *  Example input: "[1, 2, 3, 4, #, 5, #, 6, #, #, #, 7]"
     */
    public static TreeNode tree(String tree) {
        if (tree == null || tree.isEmpty()) return null;
        tree = tree.replaceAll("[\\[\\] ]", "").replace("null", "#");
        String[] nums = tree.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nums[0].trim()));
        buildTree(nums, root, 0);
        return root;
    }

    private static void buildTree(String[] nums, TreeNode node, int position) {
        int left = position * 2 + 1;
        int right = position * 2 + 2;
        if (left < nums.length && !nums[left].equals("#")) {
            node.left = new TreeNode(Integer.parseInt(nums[left]));
            buildTree(nums, node.left, left);
        }
        if (right < nums.length && !nums[right].equals("#")) {
            node.right = new TreeNode(Integer.parseInt(nums[right]));
            buildTree(nums, node.right, right);
        }
    }
}
