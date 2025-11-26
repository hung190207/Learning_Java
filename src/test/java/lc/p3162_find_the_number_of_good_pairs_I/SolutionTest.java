package lc.p3162_find_the_number_of_good_pairs_I;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums1, int[] nums2, int k, int expected) {
        int actual = new Solution().numberOfPairs(nums1, nums2, k);
        assertEquals(expected, actual);
    }
}