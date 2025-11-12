package lc.p3498_reverse_degree_of_a_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abc", 148)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String s, int expected) {
        int actual = new Solution().reverseDegree(s);
        assertEquals(expected, actual);
    }
}