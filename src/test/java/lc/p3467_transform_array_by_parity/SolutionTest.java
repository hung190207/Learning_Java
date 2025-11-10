package lc.p3467_transform_array_by_parity;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{0, 0, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int[] expected) {
        int[] actual = new Solution().transformArray(nums);
        assertArrayEquals(expected, actual);
    }
}