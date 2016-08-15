package leetcode.easy;

import others.stucture.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class No257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        printPath(list, "", root);
        return list;
    }

    private void printPath(List<String> list, String path, TreeNode root) {
        if (root == null) return;
        path = path.isEmpty() ? String.valueOf(root.val) : path + "->" + root.val;
        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        printPath(list, path, root.left);
        printPath(list, path, root.right);
    }
}
