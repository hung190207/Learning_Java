package lc.p3146_permutation_difference_between_two_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abc", "bac", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String s, String t, int expected) {
        int actual = new Solution().findPermutationDifference(s, t);
        assertEquals(expected, actual);
    }
}