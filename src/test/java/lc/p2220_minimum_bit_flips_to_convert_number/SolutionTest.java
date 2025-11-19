package lc.p2220_minimum_bit_flips_to_convert_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(10, 7, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int start, int goal, int expected) {
        int actual = new Solution().minBitFlips(start, goal);
        assertEquals(expected, actual);
    }
}