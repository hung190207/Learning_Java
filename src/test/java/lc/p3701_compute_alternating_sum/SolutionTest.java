package lc.p3701_compute_alternating_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 7}, -4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int expected) {
        int actual = new Solution().alternatingSum(nums);
        assertEquals(expected, actual);
    }
}