package lc.p1720_decode_XORed_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1, new int[]{1, 0, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] encoded, int first, int[] expected) {
        int[] actual = new Solution().decode(encoded, first);
        assertArrayEquals(expected, actual);
    }
}