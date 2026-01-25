package lc.p2206_divide_array_into_equal_pairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{15, 1, 4, 8, 12, 11, 4, 10, 4, 10, 10, 15, 20, 7}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, boolean expected) {
        assertEquals(expected, new Solution().divideArray(nums));
    }
}