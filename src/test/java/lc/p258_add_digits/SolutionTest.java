package lc.p258_add_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(38, 2),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void addDitgits(int num, int expected) {
        int actual = new Solution().addDigits(num);
        assertEquals(expected, actual);
    }

}