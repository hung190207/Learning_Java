package lc.p9_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(6, true),
                Arguments.of(1221, true),
                Arguments.of(25, false),
                Arguments.of(10, false)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void isPalindrome(int n, boolean want) {
        boolean actual = new Solution().isPalindrome(n);
        assertEquals(want, actual);
    }
}