package lc.p203_remove_linked_list_elements;

import com.sun.jdi.connect.Connector;
import lc.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println();
        return Stream.of(
                Arguments.of(head, 3, node1)
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