package lc.p205_isomorphic_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("paper", "title", true),
                Arguments.of("foo", "bar", false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void isIsomorphic(String s, String t, boolean expected) {
        boolean actual = new Solution().isIsomorphic(s, t);
        assertEquals(expected, actual);
    }
}