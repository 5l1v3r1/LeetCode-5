package solutions.medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/4/2.
 * https://leetcode.com/problems/unique-binary-search-trees-ii/
 */
public class No095 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = i + 1;
        // TODO: 2016/4/3
        return list;
    }

    public TreeNode buildBST(int[] values) {
        TreeNode root = new TreeNode(values[0]);
        for (int i = 1; i < values.length; i++) {
            TreeNode p = root;
            while (true) {
                if (values[i] < p.val) {
                    if (p.left == null) {
                        p.left = new TreeNode(values[i]);
                        break;
                    } else {
                        p = p.left;
                    }
                } else {
                    if (p.right == null) {
                        p.right = new TreeNode(values[i]);
                        break;
                    } else {
                        p = p.right;
                    }
                }
            }
        }
        return root;
    }
}
