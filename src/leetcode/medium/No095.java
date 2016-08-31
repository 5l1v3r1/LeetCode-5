package leetcode.medium;

import others.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/4/2.
 * https://leetcode.com/problems/unique-binary-search-trees-ii/
 *
 * DP (similar thought of No.096) is also work by using clone and offset:
 * https://discuss.leetcode.com/topic/2940/java-solution-with-dp
 */
public class No095 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return buildRecursive(1, n);
    }

    private List<TreeNode> buildRecursive(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(0, null);
            return list;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftList = buildRecursive(start, i - 1);
            List<TreeNode> rightList = buildRecursive(i + 1, end);
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        return list;
    }
}
