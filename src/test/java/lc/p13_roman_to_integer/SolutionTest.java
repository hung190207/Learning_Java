package lc.p13_roman_to_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("DCXXI", 621)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void romanToInt(String s, int want) {
        int actual = new Solution().romanToInt(s);
        assertEquals(want, actual);
    }

}