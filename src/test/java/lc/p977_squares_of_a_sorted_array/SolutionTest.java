package lc.p977_squares_of_a_sorted_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, int[] expected) {
        assertArrayEquals(expected, new Solution().sortedSquares(nums));

    }
}