package lc.p1323_maximum_69_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(9669, 9969)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int num, int expected) {
        assertEquals(expected, new Solution().maximum69Number(num));
    }
}