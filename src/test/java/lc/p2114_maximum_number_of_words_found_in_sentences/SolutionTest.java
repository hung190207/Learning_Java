package lc.p2114_maximum_number_of_words_found_in_sentences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String[] sentences, int expected) {
        assertEquals(expected, new Solution().mostWordsFound(sentences));
    }
}