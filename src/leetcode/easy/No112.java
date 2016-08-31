package leetcode.easy;

import others.structure.TreeNode;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/path-sum/
 */
public class No112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        // this line could be more elegant:
        // if (root.left == null && root.right == null) return root.value == sum;
        if (root.val == sum && root.left == null && root.right == null) return true;
        sum = sum - root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
