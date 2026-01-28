package lc.p3794_reverse_string_prefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abcd", 2, "bacd")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(String s, int k, String expected) {
        assertEquals(expected, new Solution().reversePrefix(s, k));
    }
}