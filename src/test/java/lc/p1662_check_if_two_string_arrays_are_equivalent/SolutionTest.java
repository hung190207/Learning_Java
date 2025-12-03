package lc.p1662_check_if_two_string_arrays_are_equivalent;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String[] word1, String[] word2, boolean expected) {
        boolean actual = new Solution().arrayStringsAreEqual(word1, word2);
        assertEquals(actual, expected);
    }
}