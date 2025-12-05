package lc.p2652_sum_multiples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(7, 21)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, int expected) {
        assertEquals(expected, new Solution().sumOfMultiples(n));
    }
}