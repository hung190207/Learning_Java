package lc.p3760_maximum_substrings_with_distinct_start;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abab", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String s, int expected) {
        assertEquals(expected, new Solution().maxDistinct(s));
    }
}