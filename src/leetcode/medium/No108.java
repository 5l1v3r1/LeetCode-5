package leetcode.medium;

import others.structure.TreeNode;

/**
 * Created by dss886 on 2016/5/15.
 */
public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return parseBST(nums, 0, nums.length - 1);
    }

    private TreeNode parseBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left + 1) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = parseBST(nums, left, mid - 1);
        node.right = parseBST(nums, mid + 1, right);
        return node;
    }
}
