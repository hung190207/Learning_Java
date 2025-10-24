package lc.p222.count_complete_tree_nodes;

import lc.util.TreeNode;

public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
