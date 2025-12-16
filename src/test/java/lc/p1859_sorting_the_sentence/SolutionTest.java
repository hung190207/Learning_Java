package lc.p1859_sorting_the_sentence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("is2 sentence4 This1 a3", "This is a sentence")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String s, String expected) {
        assertEquals(expected, new Solution().sortSentence(s));
    }
}