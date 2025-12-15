package lc.p2176_count_equal_and_divisible_pairs_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 2, 2, 1, 3}, 2, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int k, int expected) {
        assertEquals(expected, new Solution().countPairs(nums, k));
    }
}