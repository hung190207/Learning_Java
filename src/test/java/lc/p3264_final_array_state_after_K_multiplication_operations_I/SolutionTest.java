package lc.p3264_final_array_state_after_K_multiplication_operations_I;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 5, 6}, 5, 2, new int[]{8, 4, 6, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int k, int multiplier, int[] expected) {
        int[] actual = new Solution().getFinalState(nums, k, multiplier);
        assertArrayEquals(expected, actual);
    }
}