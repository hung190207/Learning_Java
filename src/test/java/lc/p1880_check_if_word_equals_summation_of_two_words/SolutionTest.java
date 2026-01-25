package lc.p1880_check_if_word_equals_summation_of_two_words;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("acb", "cba", "cdb", true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(String fW, String sW, String tW, boolean expected) {
        assertEquals(expected, new Solution().isSumEqual(fW, sW, tW));

    }
}