package lc.p1227_airplane_seat_assignment_probability;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1000000, 0.5)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, double expected) {
        double actual = new Solution().nthPersonGetsNthSeat(n);
        assertEquals(expected, actual);
    }
}