package lc.p1_two_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 4, new int[]{0, 2}),
                Arguments.of(new int[]{3, 2, 3}, 6, new int[]{0, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void twoSum(int[] arr, int target, int[] want) {
        int[] actual = new Solution().twoSum(arr, target);
        assertArrayEquals(want, actual);
    }
}