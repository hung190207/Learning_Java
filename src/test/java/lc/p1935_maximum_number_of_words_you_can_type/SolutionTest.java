package lc.p1935_maximum_number_of_words_you_can_type;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("hello world", "ad", 1),
                Arguments.of("leet code", "lt", 1),
                Arguments.of("leet code", "e", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String text, String brokenLetters, int expected) {
        assertEquals(expected, new Solution().canBeTypedWords(text, brokenLetters));
    }
}