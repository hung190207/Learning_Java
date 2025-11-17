package lc.p222_count_complete_tree_nodes;

import lc.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(TreeNode.fromArray(new Integer[]{1, 2, 3, 4, 5, 6}), 6),
                Arguments.of(TreeNode.fromArray(new Integer[]{}), 0),
                Arguments.of(TreeNode.fromArray(new Integer[]{1}), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void countNodes(TreeNode root, int expected) {
        int actual = new Solution().countNodes(root);
        assertEquals(expected, actual);
    }
}