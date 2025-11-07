package lc.p2469_convert_the_temperature;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(36.50, new double[]{309.65000, 97.70000})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(double c, double[] expected) {
        double[] actual = new Solution().convertTemperature(c);
        assertArrayEquals(expected, actual);
    }
}