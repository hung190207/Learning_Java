package lc.p349_intersection_of_two_arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums1, int[] nums2, int[] expected) {
        assertArrayEquals(expected, new Solution().intersection(nums1, nums2));

    }
}