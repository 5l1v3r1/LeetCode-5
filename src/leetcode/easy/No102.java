package leetcode.easy;

import others.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class No102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        addToResult(result, root, 0);
        return result;
    }

    private void addToResult(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) return;
        if (result.size() - 1 < level) result.add(new ArrayList<>());
        result.get(level).add(node.val);
        addToResult(result, node.left, level + 1);
        addToResult(result, node.right, level + 1);
    }
}
