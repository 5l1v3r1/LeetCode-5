package leetcode.medium;

import others.stucture.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/4/2.
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class No094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        return list;
    }

    private void inOrder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }
}
