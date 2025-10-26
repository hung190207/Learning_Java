package lc.p263_ugly_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(6, true),
                Arguments.of(1, true),
                Arguments.of(14, false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void isUgly(int num, boolean expected) {
        boolean actual = new Solution().isUgly(num);
        assertEquals(expected, actual);
    }

}