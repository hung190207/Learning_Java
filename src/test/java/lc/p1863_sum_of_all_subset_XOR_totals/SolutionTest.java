package lc.p1863_sum_of_all_subset_XOR_totals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int expected) {
        int actual = new Solution().subsetXORSum(nums);
        assertEquals(expected, actual);
    }
}