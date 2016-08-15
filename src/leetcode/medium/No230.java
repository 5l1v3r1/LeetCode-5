package leetcode.medium;

import others.stucture.TreeNode;

/**
 * Created by dss886 on 2016/5/15.
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */
public class No230 {

    private int now = 0;

    public int kthSmallest(TreeNode root, int k) {
        now = 0;
        return find(root, k).val;
    }

    public TreeNode find(TreeNode node, int k) {
        if (node == null) return null;
        TreeNode left = find(node.left, k);
        if (left != null) return left;
        now++;
        if (now == k) return node;
        return find(node.right, k);
    }
}
