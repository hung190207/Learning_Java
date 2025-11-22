package lc.p1480_running_sum_of_1d_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int[] expected) {
        int[] actual = new Solution().runningSum(nums);
        assertArrayEquals(expected, actual);
    }

}