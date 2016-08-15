package leetcode.easy;

import others.stucture.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 * Key Point:
 * 1. Use BFS or DFS to search the tree.
 * 2. Use queen(BFS) or recursive(DFS) to store the values (in List).
 */
public class No107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        addToResult(result, root, 0);
        return result;
    }

    private void addToResult(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) return;
        if (result.size() - 1 < level) result.add(0, new ArrayList<>());
        result.get(result.size() - level - 1).add(node.val);
        addToResult(result, node.left, level + 1);
        addToResult(result, node.right, level + 1);
    }
}
