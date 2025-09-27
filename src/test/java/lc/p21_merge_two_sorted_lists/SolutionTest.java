package lc.p21_merge_two_sorted_lists;

import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(new int[]{1, 2, 4}), ListNode.fromArray(new int[]{1, 3, 4}), ListNode.fromArray(new int[]{1, 1, 2, 3, 4, 4}))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void MergeTwoSortedLists(ListNode l1, ListNode l2, ListNode expected) {
        ListNode actual = new Solution().mergeTwoLists(l1, l2);
        assertAll(expected, actual);
    }

    private void assertAll(ListNode expected, ListNode actual) {
    }
}