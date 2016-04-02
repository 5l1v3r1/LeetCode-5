package solutions.medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/4/2.
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class No144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(list, root);
        return list;
    }

    private void preOrder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preOrder(list, root.left);
        preOrder(list, root.right);
    }
}
