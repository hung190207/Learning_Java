package lc.p14_longest_common_prefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "raceacar", "car"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void longestCommonPrefix(String[] strs, String expected) {
        String actual = new Solution().longestCommonPrefix(strs);
        assertEquals(expected, actual);
    }
}