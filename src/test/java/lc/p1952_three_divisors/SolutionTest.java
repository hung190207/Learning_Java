package lc.p1952_three_divisors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2, false),
                Arguments.of(4, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, boolean expected) {
        assertEquals(expected, new Solution().isThree(n));
    }
}