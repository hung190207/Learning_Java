package lc.p1342_number_of_steps_to_reduce_a_number_to_zero;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(14, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int num, int expected) {
        assertEquals(expected, new Solution().numberOfSteps(num));
    }
}