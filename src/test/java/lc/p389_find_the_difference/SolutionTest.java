package lc.p389_find_the_difference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abcd", "abcde", "e"),
                Arguments.of("", "y", "y")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void findTheDifference(String s, String t, char expected) {
        char actual = new Solution().findTheDifference(s, t);
        assertEquals(expected, actual);
    }
}
