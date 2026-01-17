package lc.p1025_divisor_game;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, boolean expected) {
        assertEquals(expected, new Solution().divisorGame(n));
    }
}