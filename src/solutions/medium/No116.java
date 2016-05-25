package solutions.medium;

import others.stucture.TreeLinkNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dss886 on 2016/5/23.
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 *
 * There is no need to use HashMap, two parameters of node will do it better:
 * https://leetcode.com/discuss/7327/a-simple-accepted-solution#a_list_title
 */
public class No116 {

    public void connect(TreeLinkNode root) {
        Map<Integer, TreeLinkNode> map = new HashMap<>();
        connectNode(map, root, 0);
    }

    private TreeLinkNode connectNode(Map<Integer, TreeLinkNode> map, TreeLinkNode node, int level) {
        if (node == null || node.left == null || node.right == null) return null;
        node.left.next = node.right;
        if (map.containsKey(level + 1)) {
            map.get(level + 1).next = node.left;
            map.remove(level + 1);
        }
        map.put(level + 1, node.right);
        connectNode(map, node.left, level + 1);
        connectNode(map, node.right, level + 1);
        return node.right;
    }
}
