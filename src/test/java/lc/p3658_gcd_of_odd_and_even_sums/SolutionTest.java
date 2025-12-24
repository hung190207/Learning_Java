package lc.p3658_gcd_of_odd_and_even_sums;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(4, 4),
                Arguments.of(5, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, int expected) {
        assertEquals(expected, new Solution().gcdOfOddEvenSums(n));
    }
}