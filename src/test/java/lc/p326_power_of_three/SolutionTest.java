package lc.p326_power_of_three;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(27, true),
                Arguments.of(1162261467, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void isPowerOfThree(int num, boolean expected) {
        boolean actual = new Solution().isPowerOfThree(num);
        assertEquals(expected, actual);
    }
}