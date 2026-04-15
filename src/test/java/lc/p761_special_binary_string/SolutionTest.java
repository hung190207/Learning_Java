package lc.p761_special_binary_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("11011000", "11100100"),
                Arguments.of("10", "10")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(String s, String expected) {
        assertEquals(expected, new Solution().makeLargestSpecial(s));
    }
}