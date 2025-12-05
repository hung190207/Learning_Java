package lc.p3427_sum_of_variable_length_subarrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1}, 11)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int expected) {
        assertEquals(expected, new Solution().subarraySum(nums));
    }
}