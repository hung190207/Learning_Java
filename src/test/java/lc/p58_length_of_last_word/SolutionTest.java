package lc.p58_length_of_last_word;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void lenghtOfLastWord(String s, int want) {
        int actual = new Solution().lengthOfLastWord(s);
        assertEquals(want, actual);
    }
}