package lc.p2181_merge_nodes_in_between_zeros;

import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lc.util.ListNode.areEqual;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(new int[]{0, 3, 1, 0, 4, 5, 2, 0}),
                        ListNode.fromArray(new int[]{4, 11}))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(ListNode head, ListNode expected) {
        ListNode actual = Solution.mergeNodes(head);
        areEqual(expected, actual);
    }

}