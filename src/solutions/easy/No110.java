package solutions.easy;

import others.stucture.TreeNode;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/balanced-binary-tree/
 *
 * This solution cost O(N^2) time as there are twice recursive.
 * Check left and right node in every recursion to avoid further useless search will reduce time cost:
 * https://leetcode.com/discuss/29893/solution-height-every-recursion-avoid-further-useless-search
 */
public class No110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        return isBalanced(root.right) && isBalanced(root.left) && Math.abs(leftHeight - rightHeight) <= 1;
    }

    private int getTreeHeight(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
