package lc.p101_symmetric_tree;

import lc.util.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left.val != root.right.val) return false;
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        return r1.val == r2.val && isSame(r1.left, r2.right) && isSame(r1.right, r2.left);
    }
}
