package solutions.medium;

import others.stucture.TreeNode;

/**
 * Created by dss886 on 2016/5/16.
 * https://leetcode.com/problems/house-robber-iii/
 */
public class No337 {
    public int rob(TreeNode root) {
        int[] result = robDeep(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robDeep(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = robDeep(node.left);
        int[] right = robDeep(node.right);
        int[] result = new int[2];
        result[0] = node.val + left[1] + right[1];
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return result;
    }
}
