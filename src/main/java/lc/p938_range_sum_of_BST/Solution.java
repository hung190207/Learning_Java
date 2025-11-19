package lc.p938_range_sum_of_BST;

import lc.util.TreeNode;

// https://leetcode.com/problems/range-sum-of-bst/description/
public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int currVal = (root.val >= low && root.val <= high) ? root.val : 0;
        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);
        return currVal + leftSum + rightSum;
    }
}
