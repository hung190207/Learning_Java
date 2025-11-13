package lc.p1678_goal_parser_interpretation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("G()(al)", "Goal")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String command, String expected) {
        String actual = new Solution().interpret(command);
        assertEquals(expected, actual);
    }
}