package leetcode.easy;

import others.structure.TreeNode;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class No235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
