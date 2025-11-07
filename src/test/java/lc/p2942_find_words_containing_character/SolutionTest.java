package lc.p2942_find_words_containing_character;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"hello", "world"}, 'o', List.of(0, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String[] words, char x, List<Integer> expected) {
        List<Integer> actual = new Solution().findWordsContaining(words, x);
        assertEquals(expected, actual);
    }
}