package lc.p2485_find_the_pivot_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(8, 6),
                Arguments.of(1, 1),
                Arguments.of(4, -1));
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int expected) {
        assertEquals(expected, new Solution().pivotInteger(n));
    }
}