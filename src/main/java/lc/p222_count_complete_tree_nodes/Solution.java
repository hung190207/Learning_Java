package lc.p222_count_complete_tree_nodes;

import lc.util.TreeNode;

// https://leetcode.com/problems/count-complete-tree-nodes/
public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
