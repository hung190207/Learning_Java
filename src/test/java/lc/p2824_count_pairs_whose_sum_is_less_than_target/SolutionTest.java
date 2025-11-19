package lc.p2824_count_pairs_whose_sum_is_less_than_target;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(-1, 1, 2, 3, 1), 2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(List<Integer> nums, int target, int expected) {
        int actual = new Solution().countPairs(nums, target);
        assertEquals(expected, actual);
    }
}