package lc.p2_add_two_numbers;

import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;

class SolutionTest {
    public static Stream<Arguments> test1() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(new int[]{0}),
                        ListNode.fromArray(new int[]{0}),
                        ListNode.fromArray(new int[]{0}))
        );
    }

    @ParameterizedTest
    @MethodSource("test1")
    void addTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        ListNode actual = new Solution().addTwoNumbers(l1, l2);
        assertAll(expected, actual);
    }

    private void assertAll(ListNode expected, ListNode actual) {
    }
}