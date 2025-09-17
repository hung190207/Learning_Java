package lc.p69_sqrt;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(4, 2),
                Arguments.of(8, 2),
                Arguments.of(2147395599, 46339)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void mySqrt(int x, int want) {
        int actual = new Solution().mySqrt(x);
        assertEquals(want, actual);
    }
}