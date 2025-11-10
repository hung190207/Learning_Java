package lc.p3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int expected) {
        int actual = new Solution().minimumOperations(nums);
        assertEquals(expected, actual);
    }
}