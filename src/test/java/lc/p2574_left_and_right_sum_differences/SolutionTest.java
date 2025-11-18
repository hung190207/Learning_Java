package lc.p2574_left_and_right_sum_differences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{10, 4, 8, 3},
                        new int[]{15, 1, 11, 22})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int[] expected) {
        int[] actual = new Solution().leftRightDifference(nums);
        assertArrayEquals(expected, actual);
    }
}