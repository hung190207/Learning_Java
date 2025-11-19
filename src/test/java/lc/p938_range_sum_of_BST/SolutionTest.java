package lc.p938_range_sum_of_BST;

import lc.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(TreeNode.fromArray(new Integer[]{10, 5, 15, 3, 7, null, 18}), 7, 15, 32)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(TreeNode root, int low, int high, int expected) {
        int actual = new Solution().rangeSumBST(root, low, high);
        assertEquals(expected, actual);
    }
}