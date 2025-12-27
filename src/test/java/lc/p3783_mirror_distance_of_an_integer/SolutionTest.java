package lc.p3783_mirror_distance_of_an_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(25, 27),
                Arguments.of(10, 9),
                Arguments.of(7, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, int expected) {
        assertEquals(expected, new Solution().mirrorDistance(n));
    }
}