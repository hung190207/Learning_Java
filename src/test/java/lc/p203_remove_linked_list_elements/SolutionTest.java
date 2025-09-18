package lc.p203_remove_linked_list_elements;

import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(new int[]{1, 2, 3}), 3, ListNode.fromArray(new int[]{1, 2}))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void removeElements(ListNode head, int val, ListNode expected) {
        ListNode actual = new Solution().removeElements(head, val);
        assertAll(expected, actual);
    }

    private void assertAll(ListNode expected, ListNode actual) {
    }
}