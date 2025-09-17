package lc.p125_valid_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> testPalindrome() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true)

        );
    }

    @ParameterizedTest
    @MethodSource("testPalindrome")
    void isPalindrome(String str, boolean expected) {
        boolean actual = new Solution().isPalindrome(str);
        assertEquals(expected, actual);
    }
}