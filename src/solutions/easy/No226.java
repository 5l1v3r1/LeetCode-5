package solutions.easy;

import others.stucture.TreeNode;

/**
 * Created by dss886 on 2016/3/5.
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class No226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        return node;
    }
}
