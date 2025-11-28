package lc.p1816_truncate_sentence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("Hello how are you Contestant", 4, "Hello how are you")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String s, int k, String expected) {
        String actual = new Solution().truncateSentence(s, k);
        assertEquals(expected, actual);
    }
}