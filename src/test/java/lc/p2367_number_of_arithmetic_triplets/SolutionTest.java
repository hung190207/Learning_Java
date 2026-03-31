package lc.p2367_number_of_arithmetic_triplets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 4, 6, 7, 10}, 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, int diff, int expected) {
        assertEquals(expected, new Solution().arithmeticTriplets(nums, diff));

    }
}