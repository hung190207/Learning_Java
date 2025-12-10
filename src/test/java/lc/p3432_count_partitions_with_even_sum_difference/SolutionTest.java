package lc.p3432_count_partitions_with_even_sum_difference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{10, 10, 3, 7, 6}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int expected) {
        assertEquals(expected, new Solution().countPartitions(nums));
    }
}