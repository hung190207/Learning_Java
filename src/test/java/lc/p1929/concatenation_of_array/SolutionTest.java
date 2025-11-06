package lc.p1929.concatenation_of_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void concatenation(int[] nums, int[] expected) {
        int[] actual = new Solution().getConcatenation(nums);
        assertArrayEquals(expected, actual);
    }
}