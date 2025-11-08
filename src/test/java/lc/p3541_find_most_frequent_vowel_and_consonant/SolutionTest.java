package lc.p3541_find_most_frequent_vowel_and_consonant;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("successes", 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String s, int expected) {
        int actual = new Solution().maxFreqSum(s);
        assertEquals(expected, actual);
    }
}