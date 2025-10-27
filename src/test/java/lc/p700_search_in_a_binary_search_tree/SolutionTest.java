package lc.p700_search_in_a_binary_search_tree;

import lc.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> searchBST() {
        return Stream.of(
                Arguments.of(TreeNode.fromArray(new Integer[]{4, 2, 7, 1, 3}),
                        2,
                        TreeNode.fromArray(new Integer[]{2, 1, 3})),
                Arguments.of(TreeNode.fromArray(new Integer[]{4, 2, 7, 1, 3}),
                        5,
                        TreeNode.fromArray(new Integer[]{}))
        );
    }

    @ParameterizedTest
    @MethodSource("searchBST")
    void searchBST(TreeNode root, int val, TreeNode expected) {
        TreeNode actual = new Solution().searchBST(root, val);
        assertAll(expected, actual);
    }

    private void assertAll(TreeNode expected, TreeNode actual) {
        if (expected == null || actual == null) {
            assertEquals(expected, actual);
            return;
        }

        assertEquals(expected.val, actual.val);
        assertAll(expected.left, actual.left);
        assertAll(expected.right, actual.right);
    }
}