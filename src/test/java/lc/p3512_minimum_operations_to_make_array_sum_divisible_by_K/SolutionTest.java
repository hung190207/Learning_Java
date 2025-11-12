package lc.p3512_minimum_operations_to_make_array_sum_divisible_by_K;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 9, 7}, 5, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int k, int expected) {
        int actual = new Solution().minOperations(nums, k);
        assertEquals(expected, actual);
    }
}