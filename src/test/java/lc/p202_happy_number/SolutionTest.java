package lc.p202_happy_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(19, true),
                Arguments.of(10, true),
                Arguments.of(11, false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    public void test(int n, boolean expected) {
        boolean actual = new Solution().isHappy(n);
        assertEquals(expected, actual);
    }

}