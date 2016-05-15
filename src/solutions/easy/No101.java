package solutions.easy;

import others.stucture.TreeNode;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/symmetric-tree/
 */
public class No101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    @SuppressWarnings("SimplifiableIfStatement")
    private boolean isMirror(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        return p.val == q.val && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
