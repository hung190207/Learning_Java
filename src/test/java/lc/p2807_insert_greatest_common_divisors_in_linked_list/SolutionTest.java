package lc.p2807_insert_greatest_common_divisors_in_linked_list;

import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lc.util.ListNode.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(new int[]{18, 6, 10, 3}),
                        ListNode.fromArray(new int[]{18, 6, 6, 2, 10, 1, 3}))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void insertGCD(ListNode head, ListNode expected) {
        ListNode actual = new Solution().insertGreatestCommonDivisors(head);
        assertTrue(areEqual(expected, actual));
    }
}