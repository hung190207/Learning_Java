package lc.p100_same_tree;

import lc.util.TreeNode;

// https://leetcode.com/problems/same-tree/
public class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode tree = new TreeNode(0);
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
