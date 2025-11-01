package lc.p496_next_greater_element_I;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test1() {
        return Stream.of(
                Arguments.of(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}),
                Arguments.of(new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1})
        );
    }

    @ParameterizedTest
    @MethodSource("test1")
    void nextGreaterElements(int[] nums1, int[] nums2, int[] expected) {
        int[] actual = new Solution().nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}