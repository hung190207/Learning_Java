package lc.p2433_find_the_original_array_of_prefix_xor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{5, 2, 0, 3, 1},
                        new int[]{5, 7, 2, 3, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] pref, int[] expected) {
        int[] actual = new Solution().findArray(pref);
        assertArrayEquals(expected, actual);
    }
}