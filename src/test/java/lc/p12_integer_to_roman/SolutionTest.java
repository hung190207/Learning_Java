package lc.p12_integer_to_roman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> intToRoman() {
        return Stream.of(
                Arguments.of(1994, "MCMXCIV"),
                Arguments.of(58, "LVIII"),
                Arguments.of(3749, "MMMDCCXLIX")
        );
    }

    @ParameterizedTest
    @MethodSource("intToRoman")
    void intToRoman(int num, String expected) {
        String actual = new Solution().intToRoman(num);
        assertEquals(expected, actual);
    }
}