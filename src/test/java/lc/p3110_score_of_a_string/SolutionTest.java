package lc.p3110_score_of_a_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test(){
        return Stream.of(
                Arguments.of("hello",13)
        );
    }
    @ParameterizedTest
    @MethodSource("test")
    void scoreOfString(String s, int expected) {
        int actual = new Solution().scoreOfString(s);
        assertEquals(expected, actual);
    }
}