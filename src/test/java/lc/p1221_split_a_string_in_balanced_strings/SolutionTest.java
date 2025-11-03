package lc.p1221_split_a_string_in_balanced_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("RLRRLLRLRL", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void balancedStringSplit(String s, int expected) {
        int actual = new Solution().balancedStringSplit(s);
        assertEquals(expected, actual);
    }
}