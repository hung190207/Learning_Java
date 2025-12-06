package lc.p2006_count_number_of_pairs_with_absolute_difference_K;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, 1, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int k, int expected) {
        assertEquals(expected, new Solution().countKDifference(nums, k));
    }
}