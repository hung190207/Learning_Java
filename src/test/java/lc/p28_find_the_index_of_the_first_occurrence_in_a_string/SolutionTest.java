package lc.p28_find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void strStr(String haystack, String needle, int expected) {
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }
}