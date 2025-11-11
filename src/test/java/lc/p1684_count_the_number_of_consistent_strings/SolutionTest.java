package lc.p1684_count_the_number_of_consistent_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("ab",
                        new String[]{"ad", "bd", "aaab", "baa", "badab"},
                        2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String allowed, String[] words, int expected) {
        int actual = new Solution().countConsistentStrings(allowed, words);
        assertEquals(expected, actual);
    }
}