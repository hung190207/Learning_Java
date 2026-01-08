package lc.p2160_minimum_sum_of_four_digit_number_after_splitting_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2932, 52)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int num, int expected) {
        assertEquals(expected, new Solution().minimumSum(num));
    }
}