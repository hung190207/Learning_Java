package lc.p100_same_tree;

import lc.util.TreeNode;

import static lc.p100_same_tree.Solution.isSameTree;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        if (isSameTree(p, q)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}