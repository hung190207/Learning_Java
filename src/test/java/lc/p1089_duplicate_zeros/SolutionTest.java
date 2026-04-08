package lc.p1089_duplicate_zeros;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 2, 3, 0, 4, 5, 0}, new int[]{1, 0, 0, 2, 3, 0, 0, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] arr, int[] expected) {
        new Solution().duplicateZeros(arr);
        assertArrayEquals(expected, arr);

    }
}