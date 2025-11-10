package lc.p2396_strictly_palindromic_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(9, false),
                Arguments.of(4, false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int n, boolean expected) {
        boolean actual = new Solution().isStrictlyPalindromic(n);
        assertEquals(expected, actual);
    }
}