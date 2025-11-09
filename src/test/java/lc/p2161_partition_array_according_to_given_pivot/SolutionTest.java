package lc.p2161_partition_array_according_to_given_pivot;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{9, 12, 5, 10, 14, 3, 10},
                        10,
                        new int[]{9, 5, 3, 10, 10, 12, 14})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int pivot, int[] expected) {
        int[] actual = new Solution().pivotArray(nums, pivot);
        assertArrayEquals(expected, actual);
    }
}