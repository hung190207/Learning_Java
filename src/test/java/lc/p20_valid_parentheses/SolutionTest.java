package lc.p20_valid_parentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("{}", true),
                Arguments.of("{[}", false),
                Arguments.of("{}[]()", true),
                Arguments.of("(]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void isValid(String s, boolean expected) {
        boolean actual = new Solution().isValid(s);
        assertEquals(expected,actual);
    }
}