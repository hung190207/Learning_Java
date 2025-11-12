package lc.p2413_smallest_even_multiple;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int n, int expected) {
        int actual = new Solution().smallestEvenMultiple(n);
        assertEquals(expected, actual);
    }
}