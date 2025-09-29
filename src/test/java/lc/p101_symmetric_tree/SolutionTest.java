package lc.p101_symmetric_tree;

import lc.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(TreeNode.fromArray(new Integer[]{1, 2, 2}), true),
                Arguments.of(TreeNode.fromArray(new Integer[]{1,2,2,3,4,4,3}), true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void isSymmetric(TreeNode root, boolean expected) {
        boolean actual = new Solution().isSymmetric(root);
        assertEquals(expected, actual);
    }
}