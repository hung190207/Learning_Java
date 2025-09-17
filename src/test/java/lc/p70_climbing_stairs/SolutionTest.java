package lc.p70_climbing_stairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(45, 1836311903)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void climbStairs(int n, int want) {
        int actual = new Solution().climbStairs(n);
        assertEquals(want, actual);
    }
}