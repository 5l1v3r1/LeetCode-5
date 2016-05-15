package solutions.easy;

import others.stucture.TreeNode;

/**
 * Created by dss886 on 2016/3/5.
 * https://leetcode.com/problems/same-tree/
 */
public class No100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val == q.val;
    }
}
