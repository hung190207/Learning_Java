package lc.p1470_shuffle_the_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2, 3, 5, 4, 1, 7})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int n, int[] expected) {
        int[] actual = new Solution().shuffle(nums, n);
        assertArrayEquals(expected, actual);
    }
}