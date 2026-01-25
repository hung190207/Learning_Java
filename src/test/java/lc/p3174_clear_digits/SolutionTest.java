package lc.p3174_clear_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abc", "abc"),
                Arguments.of("cb34", "")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(String s, String expected) {
        assertEquals(expected, new Solution().clearDigits(s));
    }
}