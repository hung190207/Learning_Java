package lc.p2044_count_number_of_maximum_bitwise_or_subsets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 1}, 2),
                Arguments.of(new int[]{2, 2, 2}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int expected) {
        int actual = new Solution().countMaxOrSubsets(nums);
        assertEquals(expected, actual);
    }
}