package lc.p2520_count_the_digits_that_divide_a_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(7, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int num, int expected) {
        assertEquals(expected, new Solution().countDigits(num));
    }
}