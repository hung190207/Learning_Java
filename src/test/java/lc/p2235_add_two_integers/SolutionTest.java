package lc.p2235_add_two_integers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, 2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int num1, int num2, int expected) {
        int actual = new Solution().sum(num1, num2);
        assertEquals(expected, actual);
    }
}