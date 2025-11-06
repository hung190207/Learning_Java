package lc.p1920_build_array_from_permutation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 1, 5, 3, 4}, new int[]{0, 1, 2, 4, 5, 3}),
                Arguments.of(new int[]{5, 0, 1, 2, 3, 4}, new int[]{4, 5, 0, 1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void permutation(int[] nums, int[] expected) {
        int[] actual = new Solution().buildArray(nums);
        assertArrayEquals(expected, actual);
    }
}