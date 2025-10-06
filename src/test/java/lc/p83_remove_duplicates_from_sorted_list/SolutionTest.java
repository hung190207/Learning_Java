package lc.p83_remove_duplicates_from_sorted_list;

import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(new int[]{1, 1, 2, 3}), ListNode.fromArray(new int[]{1, 2, 3})),
                Arguments.of(ListNode.fromArray(new int[]{1, 1, 2, 2, 3}), ListNode.fromArray(new int[]{1, 2, 3}))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void deleteDuplicates(ListNode head, ListNode expected) {
        ListNode actual = new Solution().deleteDuplicates(head);
        assertAll(expected, actual);
    }

    private void assertAll(ListNode expected, ListNode actual) {
    }
}